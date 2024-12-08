#include <stdio.h>
#include <stdlib.h>

#define MAX 100 // Maximum size of the queue

// Global variables for queue
int queue[MAX];
int front = -1; // Index of the front element
int rear = -1;  // Index of the rear element

// Function to check if the queue is full
int isFull() {
    return (rear + 1) % MAX == front; // Circular condition
}

// Function to check if the queue is empty
int isEmpty() {
    return front == -1; // Queue is empty if front is -1
}

// Function to insert an element into the queue
void insert(int value) {
    if (isFull()) {
        printf("Queue Overflow! Cannot insert %d\n", value);
    } else {
        if (isEmpty()) {
            front = 0; // Initialize front if queue was empty
        }
        rear = (rear + 1) % MAX; // Move rear to the next position
        queue[rear] = value; // Insert the new element
        printf("%d inserted into queue\n", value);
    }
}

// Function to delete an element from the queue
int delete() {
    if (isEmpty()) {
        printf("Queue Underflow! Cannot delete from an empty queue\n");
        return -1; // Return -1 to indicate an error
    } else {
        int deletedValue = queue[front]; // Get the front element
        if (front == rear) {
            front = rear = -1; // Queue becomes empty
        } else {
            front = (front + 1) % MAX; // Move front to the next position
        }
        return deletedValue; // Return the deleted value
    }
}

// Function to display the elements of the queue
void display() {
    if (isEmpty()) {
        printf("Queue is empty!\n");
    } else {
        printf("Queue elements: ");
        int i = front;
        while (1) {
            printf("%d ", queue[i]);
            if (i == rear) break; // Stop when we reach the rear
            i = (i + 1) % MAX; // Move to the next position
        }
        printf("\n");
    }
}

// Main function to demonstrate queue operations
int main() {
    int choice, value;

    do {
        printf("\nQueue Operations:\n");
        printf("1. INSERT\n");
        printf("2. DELETE\n");
        printf("3. DISPLAY\n");
        printf("4. EXIT\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to insert: ");
                scanf("%d", &value);
                insert(value);
                break;
            case 2:
                value = delete();
                if (value != -1) {
                    printf("Deleted value: %d\n", value);
                }
                break;
            case 3:
                display();
                break;
            case 4:
                printf("Exiting...\n");
                break;
            default:
                printf("Invalid choice! Please try again.\n");
        }
    } while (choice != 4);

    return 0;
}