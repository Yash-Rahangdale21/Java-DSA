#include <stdio.h>
#include <stdlib.h>

#define MAX_REQUESTS 20

// Function prototypes
void fcfs(int requests[], int n, int head);
void sstf(int requests[], int n, int head);
void cscan(int requests[], int n, int head, int total_cylinders);
void sort(int arr[], int n);

int main() {
    int requests[MAX_REQUESTS], n, head, total_cylinders;

    printf("Enter the number of disk requests (up to %d): ", MAX_REQUESTS);
    scanf("%d", &n);
    printf("Enter the disk requests:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &requests[i]);
    }
    printf("Enter the initial head position: ");
    scanf("%d", &head);
    printf("Enter the total number of cylinders: ");
    scanf("%d", &total_cylinders);

    printf("\n--- Disk Scheduling Algorithms ---\n");
    printf("1. First-Come, First-Served (FCFS)\n");
    fcfs(requests, n, head);

    printf("\n2. Shortest Seek Time First (SSTF)\n");
    sstf(requests, n, head);

    printf("\n3. Circular Scan (C-SCAN)\n");
    cscan(requests, n, head, total_cylinders);

    return 0;
}

void fcfs(int requests[], int n, int head) {
    int total_movement = 0;
    int current_position = head;

    printf("FCFS Order of Requests: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", requests[i]);
        total_movement += abs(requests[i] - current_position);
        current_position = requests[i];
    }
    printf("\nTotal Head Movement: %d\n", total_movement);
}

void sstf(int requests[], int n, int head) {
    int total_movement = 0;
    int completed[MAX_REQUESTS] = {0};
    int current_position = head;

    for (int i = 0; i < n; i++) {
        int min_index = -1;
        int min_distance = 10000; // Arbitrarily large number

        for (int j = 0; j < n; j++) {
            if (!completed[j]) {
                int distance = abs(requests[j] - current_position);
                if (distance < min_distance) {
                    min_distance = distance;
                    min_index = j;
                }
            }
        }

        if (min_index != -1) {
            printf("%d ", requests[min_index]);
            total_movement += min_distance;
            current_position = requests[min_index];
            completed[min_index] = 1;
        }
    }
    printf("\nTotal Head Movement: %d\n", total_movement);
}

void cscan(int requests[], int n, int head, int total_cylinders) {
    int total_movement = 0;
    int sorted_requests[MAX_REQUESTS];
    int count = 0;

    // Sort requests
    for (int i = 0; i < n; i++) {
        sorted_requests[i] = requests[i];
    }
    sort(sorted_requests, n);

    printf("C-SCAN Order of Requests: ");
    // Serve requests from the head position to the end
    for (int i = 0; i < n; i++) {
        if (sorted_requests[i] >= head) {
            printf("%d ", sorted_requests[i]);
            total_movement += abs(sorted_requests[i] - head);
            head = sorted_requests[i];
            count++;
        }
    }

    // Move to the end of the cylinder and return to start
    if (count > 0) {
        total_movement += abs(total_cylinders - 1 - head);
        head = 0;
        total_movement += abs(head - (total_cylinders - 1));
    }

    // Serve remaining requests
    for (int i = 0; i < n; i++) {
        if (sorted_requests[i] < head) {
            printf("%d ", sorted_requests[i]);
            total_movement += abs(sorted_requests[i] - head);
            head = sorted_requests[i];
        }
    }
    printf("\nTotal Head Movement: %d\n", total_movement);
}

void sort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
