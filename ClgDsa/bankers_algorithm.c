#include <stdio.h>
#include <stdbool.h>

#define MAX_PROCESSES 5
#define MAX_RESOURCES 3

int processes[MAX_PROCESSES] = {0, 1, 2, 3, 4};
int maxResources[MAX_PROCESSES][MAX_RESOURCES] = {
    {7, 5, 3},
    {3, 2, 2},
    {9, 0, 2},
    {2, 2, 2},
    {4, 3, 3}
};

int allocatedResources[MAX_PROCESSES][MAX_RESOURCES] = {
    {0, 1, 0},
    {2, 0, 0},
    {3, 0, 2},
    {2, 1, 1},
    {0, 0, 2}
};

int availableResources[MAX_RESOURCES] = {3, 3, 2};

void calculateNeed(int need[MAX_PROCESSES][MAX_RESOURCES]) {
    for (int i = 0; i < MAX_PROCESSES; i++) {
        for (int j = 0; j < MAX_RESOURCES; j++) {
            need[i][j] = maxResources[i][j] - allocatedResources[i][j];
        }
    }
}

bool isSafe(int need[MAX_PROCESSES][MAX_RESOURCES], int work[MAX_RESOURCES], bool finish[MAX_PROCESSES]) {
    int safeSequence[MAX_PROCESSES];
    int count = 0;

    for (int i = 0; i < MAX_RESOURCES; i++) {
        work[i] = availableResources[i];
    }

    while (count < MAX_PROCESSES) {
        bool found = false;
        for (int p = 0; p < MAX_PROCESSES; p++) {
            if (!finish[p]) {
                int j;
                for (j = 0; j < MAX_RESOURCES; j++) {
                    if (need[p][j] > work[j]) {
                        break;
                    }
                }
                if (j == MAX_RESOURCES) {
                    for (int k = 0; k < MAX_RESOURCES; k++) {
                        work[k] += allocatedResources[p][k];
                    }
                    safeSequence[count++] = p;
                    finish[p] = true;
                    found = true;
                }
            }
        }
        if (!found) {
            printf("System is not in a safe state.\n");
            return false;
        }
    }

    printf("System is in a safe state.\nSafe sequence is: ");
    for (int i = 0; i < MAX_PROCESSES; i++) {
        printf("%d ", safeSequence[i]);
    }
    printf("\n");
    return true;
}

int main() {
    int need[MAX_PROCESSES][MAX_RESOURCES];
    int work[MAX_RESOURCES];
    bool finish[MAX_PROCESSES] = {false};

    calculateNeed(need);
    isSafe(need, work, finish);

    return 0;
}
