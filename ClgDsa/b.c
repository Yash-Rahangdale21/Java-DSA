#include <stdio.h>

#define P 5 
#define R 3  

int issafe(int avail[], int max[][R], int alloc[][R]) {
    int need[P][R], finish[P] = {0}, safeseq[P], work[R];

    for (int i = 0; i < P; i++) {
        for (int j = 0; j < R; j++) {
            need[i][j] = max[i][j] - alloc[i][j];
        }
    }

    for (int i = 0; i < R; i++) {
        work[i] = avail[i];
    }

    int count = 0;
    while (count < P) {
        int found = 0;
        for (int p = 0; p < P; p++) {
            if (!finish[p]) {
                int j;
                for (j = 0; j < R; j++) {
                    if (need[p][j] > work[j]) {
                        break;
                    }
                }

                if (j == R) {
                    for (int k = 0; k < R; k++) {
                        work[k] += alloc[p][k];
                    }
                    safeseq[count++] = p;
                    finish[p] = 1;
                    found = 1;
                }
            }
        }

        if (!found) {
            printf("System is not in a safe state.\n");
            return 0;
        }
    }

    printf("System is in a safe state.\nSafe Sequence: ");
    for (int i = 0; i < P; i++) {
        printf("P%d ", safeseq[i]);
    }
    printf("\n");
    return 1;
}

int main() {
    int avail[] = {3, 3, 2}; 
    int max[P][R] = { {7, 4, 3}, {3, 2, 2}, {9, 0, 2}, {2, 2, 2}, {4, 3, 3} }; 
    int alloc[P][R] = { {0, 1, 0}, {2, 0, 0}, {3, 0, 2}, {2, 1, 1}, {0, 0, 2} };  
    issafe(avail, max, alloc);
    return 0;
}
