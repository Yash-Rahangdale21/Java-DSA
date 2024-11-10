#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

#define NUM_THREADS 4
#define ARRAY_SIZE 100

typedef struct {
    int *array;
    int start;
    int end;
    long sum;
} ThreadData;

void* calculate_sum(void* arg) {
    ThreadData *data = (ThreadData*)arg;
    data->sum = 0;

    for (int i = data->start; i < data->end; i++) {
        data->sum += data->array[i];
    }

    return NULL;
}

int main() {
    int array[ARRAY_SIZE];
    pthread_t threads[NUM_THREADS];
    ThreadData threadData[NUM_THREADS];
    long total_sum = 0;

    // Initialize the array with values
    for (int i = 0; i < ARRAY_SIZE; i++) {
        array[i] = i + 1;  // Array with values 1 to 100
    }

    int chunk_size = ARRAY_SIZE / NUM_THREADS;

    // Create threads
    for (int i = 0; i < NUM_THREADS; i++) {
        threadData[i].array = array;
        threadData[i].start = i * chunk_size;
        threadData[i].end = (i + 1) * chunk_size;
        pthread_create(&threads[i], NULL, calculate_sum, (void*)&threadData[i]);
    }

    // Wait for threads to finish and collect the results
    for (int i = 0; i < NUM_THREADS; i++) {
        pthread_join(threads[i], NULL);
        total_sum += threadData[i].sum;
    }

    // Output the total sum
    printf("Total sum of array: %ld\n", total_sum);

    return 0;
}
