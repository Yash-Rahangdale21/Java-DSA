#include <stdio.h>
#include <stdlib.h>

#define MAX_PROCESSES 10

typedef struct {
    int processID;
    int burstTime;
    int arrivalTime;
    int waitingTime;
    int turnaroundTime;
    int priority; // For priority scheduling
} Process;

// Function declarations
void calculateFCFS(Process processes[], int n);
void calculateSJF(Process processes[], int n);
void calculatePriority(Process processes[], int n);
void calculateRoundRobin(Process processes[], int n, int timeQuantum);
void printTable(Process processes[], int n);

int main() {
    Process processes[MAX_PROCESSES];
    int n, timeQuantum;

    // Input process details
    printf("Enter the number of processes (up to %d): ", MAX_PROCESSES);
    scanf("%d", &n);
    
    for (int i = 0; i < n; i++) {
        processes[i].processID = i + 1;
        printf("Enter burst time for Process %d: ", i + 1);
        scanf("%d", &processes[i].burstTime);
        processes[i].arrivalTime = 0; // All processes arrive at time 0
        processes[i].priority = 0; // Default priority
    }

    // Display the menu for scheduling policies
    printf("\nChoose a scheduling algorithm:\n");
    printf("1. First Come First Serve\n");
    printf("2. Non-preemptive Shortest Job First\n");
    printf("3. Non-preemptive Priority Scheduling\n");
    printf("4. Round Robin\n");
    printf("Enter your choice: ");
    int choice;
    scanf("%d", &choice);

    switch (choice) {
        case 1:
            calculateFCFS(processes, n);
            break;
        case 2:
            calculateSJF(processes, n);
            break;
        case 3:
            printf("Enter priority for each process (lower number indicates higher priority):\n");
            for (int i = 0; i < n; i++) {
                printf("Priority for Process %d: ", i + 1);
                scanf("%d", &processes[i].priority);
            }
            calculatePriority(processes, n);
            break;
        case 4:
            printf("Enter time quantum for Round Robin: ");
            scanf("%d", &timeQuantum);
            calculateRoundRobin(processes, n, timeQuantum);
            break;
        default:
            printf("Invalid choice!\n");
            break;
    }

    return 0;
}

void calculateFCFS(Process processes[], int n) {
    int totalWaitingTime = 0, totalTurnaroundTime = 0;
    int completionTime[MAX_PROCESSES];

    completionTime[0] = processes[0].burstTime;
    processes[0].waitingTime = 0;
    processes[0].turnaroundTime = completionTime[0];

    for (int i = 1; i < n; i++) {
        completionTime[i] = completionTime[i - 1] + processes[i].burstTime;
        processes[i].waitingTime = completionTime[i - 1];
        processes[i].turnaroundTime = completionTime[i];
    }

    for (int i = 0; i < n; i++) {
        totalWaitingTime += processes[i].waitingTime;
        totalTurnaroundTime += processes[i].turnaroundTime;
    }

    printf("\nFCFS Scheduling:\n");
    printTable(processes, n);
    printf("Average Waiting Time: %.2f\n", (float)totalWaitingTime / n);
    printf("Average Turnaround Time: %.2f\n", (float)totalTurnaroundTime / n);
}

void calculateSJF(Process processes[], int n) {
    Process sortedProcesses[MAX_PROCESSES];
    for (int i = 0; i < n; i++) {
        sortedProcesses[i] = processes[i];
    }

    // Sort processes based on burst time (SJF)
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (sortedProcesses[j].burstTime > sortedProcesses[j + 1].burstTime) {
                Process temp = sortedProcesses[j];
                sortedProcesses[j] = sortedProcesses[j + 1];
                sortedProcesses[j + 1] = temp;
            }
        }
    }

    int totalWaitingTime = 0, totalTurnaroundTime = 0;
    int completionTime[MAX_PROCESSES];

    completionTime[0] = sortedProcesses[0].burstTime;
    sortedProcesses[0].waitingTime = 0;
    sortedProcesses[0].turnaroundTime = completionTime[0];

    for (int i = 1; i < n; i++) {
        completionTime[i] = completionTime[i - 1] + sortedProcesses[i].burstTime;
        sortedProcesses[i].waitingTime = completionTime[i - 1];
        sortedProcesses[i].turnaroundTime = completionTime[i];
    }

    for (int i = 0; i < n; i++) {
        totalWaitingTime += sortedProcesses[i].waitingTime;
        totalTurnaroundTime += sortedProcesses[i].turnaroundTime;
    }

    printf("\nSJF Scheduling:\n");
    printTable(sortedProcesses, n);
    printf("Average Waiting Time: %.2f\n", (float)totalWaitingTime / n);
    printf("Average Turnaround Time: %.2f\n", (float)totalTurnaroundTime / n);
}

void calculatePriority(Process processes[], int n) {
    Process sortedProcesses[MAX_PROCESSES];
    for (int i = 0; i < n; i++) {
        sortedProcesses[i] = processes[i];
    }

    // Sort processes based on priority (non-preemptive)
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (sortedProcesses[j].priority > sortedProcesses[j + 1].priority) {
                Process temp = sortedProcesses[j];
                sortedProcesses[j] = sortedProcesses[j + 1];
                sortedProcesses[j + 1] = temp;
            }
        }
    }

    int totalWaitingTime = 0, totalTurnaroundTime = 0;
    int completionTime[MAX_PROCESSES];

    completionTime[0] = sortedProcesses[0].burstTime;
    sortedProcesses[0].waitingTime = 0;
    sortedProcesses[0].turnaroundTime = completionTime[0];

    for (int i = 1; i < n; i++) {
        completionTime[i] = completionTime[i - 1] + sortedProcesses[i].burstTime;
        sortedProcesses[i].waitingTime = completionTime[i - 1];
        sortedProcesses[i].turnaroundTime = completionTime[i];
    }

    for (int i = 0; i < n; i++) {
        totalWaitingTime += sortedProcesses[i].waitingTime;
        totalTurnaroundTime += sortedProcesses[i].turnaroundTime;
    }

    printf("\nPriority Scheduling:\n");
    printTable(sortedProcesses, n);
    printf("Average Waiting Time: %.2f\n", (float)totalWaitingTime / n);
    printf("Average Turnaround Time: %.2f\n", (float)totalTurnaroundTime / n);
}

void calculateRoundRobin(Process processes[], int n, int timeQuantum) {
    int remainingBurst[MAX_PROCESSES];
    for (int i = 0; i < n; i++) {
        remainingBurst[i] = processes[i].burstTime;
    }

    int totalWaitingTime = 0, totalTurnaroundTime = 0;
    int time = 0;

    while (1) {
        int done = 1;
        for (int i = 0; i < n; i++) {
            if (remainingBurst[i] > 0) {
                done = 0; // There is still a process to execute
                if (remainingBurst[i] > timeQuantum) {
                    time += timeQuantum;
                    remainingBurst[i] -= timeQuantum;
                } else {
                    time += remainingBurst[i];
                    processes[i].turnaroundTime = time;
                    processes[i].waitingTime = processes[i].turnaroundTime - processes[i].burstTime;
                    totalWaitingTime += processes[i].waitingTime;
                    totalTurnaroundTime += processes[i].turnaroundTime;
                    remainingBurst[i] = 0; // Process finished
                }
            }
        }
        if (done) {
            break; // All processes are done
        }
    }

    printf("\nRound Robin Scheduling:\n");
    printTable(processes, n);
    printf("Average Waiting Time: %.2f\n", (float)totalWaitingTime / n);
    printf("Average Turnaround Time: %.2f\n", (float)totalTurnaroundTime / n);
}

void printTable(Process processes[], int n) {
    printf("\nProcess ID | Burst Time | Waiting Time | Turnaround Time\n");
    printf("--------------------------------------------------------\n");
    for (int i = 0; i < n; i++) {
        printf("     %d     |     %d     |      %d      |        %d\n",
               processes[i].processID, processes[i].burstTime,
               processes[i].waitingTime, processes[i].turnaroundTime);
    }
}
