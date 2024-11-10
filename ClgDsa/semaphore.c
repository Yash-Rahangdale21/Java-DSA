#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>

#define BUFFER_SIZE 5
int buffer[BUFFER_SIZE];
int count = 0;

sem_t empty; // Counts the number of empty slots
sem_t full;  // Counts the number of full slots
pthread_mutex_t mutex;

void* producer(void* arg) {
    for (int i = 0; i < 10; i++) {
        sem_wait(&empty); // Wait for an empty slot
        pthread_mutex_lock(&mutex);
        
        buffer[count++] = i; // Produce an item
        printf("Produced: %d\n", i);
        
        pthread_mutex_unlock(&mutex);
        sem_post(&full); // Signal that a new item is available
        sleep(1); // Simulate production time
    }
    return NULL;
}

void* consumer(void* arg) {
    for (int i = 0; i < 10; i++) {
        sem_wait(&full); // Wait for a full slot
        pthread_mutex_lock(&mutex);
        
        int item = buffer[--count]; // Consume an item
        printf("Consumed: %d\n", item);
        
        pthread_mutex_unlock(&mutex);
        sem_post(&empty); // Signal that a slot has been freed
        sleep(2); // Simulate consumption time
    }
    return NULL;
}

int main() {
    pthread_t prod_thread, cons_thread;
    
    sem_init(&empty, 0, BUFFER_SIZE); // All slots are empty initially
    sem_init(&full, 0, 0); // No slots are full initially
    pthread_mutex_init(&mutex, NULL);
    
    pthread_create(&prod_thread, NULL, producer, NULL);
    pthread_create(&cons_thread, NULL, consumer, NULL);
    
    pthread_join(prod_thread, NULL);
    pthread_join(cons_thread, NULL);
    
    sem_destroy(&empty);
    sem_destroy(&full);
    pthread_mutex_destroy(&mutex);

    return 0;
}
