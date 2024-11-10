#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

void childProcess() {
    printf("Child Process (PID: %d, Parent PID: %d)\n", getpid(), getppid());
    sleep(2); // Simulating some work in the child process
    printf("Child Process is exiting.\n");
    exit(0); // Exiting child process
}

void vforkExample() {
    pid_t pid = vfork();

    if (pid < 0) {
        perror("vfork failed");
        exit(1);
    } else if (pid == 0) {
        // In child process
        printf("Child Process using vfork (PID: %d, Parent PID: %d)\n", getpid(), getppid());
        _exit(0); // Use _exit instead of exit to avoid flushing stdio buffers
    } else {
        // In parent process
        wait(NULL); // Wait for child to finish
        printf("Parent Process after vfork (PID: %d)\n", getpid());
    }
}

void execExample() {
    pid_t pid = fork();

    if (pid < 0) {
        perror("Fork failed");
        exit(1);
    } else if (pid == 0) {
        // In child process
        printf("Child Process before exec (PID: %d)\n", getpid());
        execlp("ls", "ls", "-l", NULL); // Replace child process with 'ls -l'
        perror("execlp failed"); // This will only be reached if execlp fails
        exit(1);
    } else {
        // In parent process
        wait(NULL); // Wait for child to finish
        printf("Parent Process after exec (PID: %d)\n", getpid());
    }
}

int main() {
    printf("Main Process (PID: %d)\n", getpid());

    // Demonstrate fork
    pid_t pid = fork();

    if (pid < 0) {
        perror("Fork failed");
        exit(1);
    } else if (pid == 0) {
        // In child process
        childProcess();
    } else {
        // In parent process
        wait(NULL); // Wait for child to finish
        printf("Parent Process after fork (PID: %d)\n", getpid());
    }

    // Demonstrate vfork
    printf("\nDemonstrating vfork:\n");
    vforkExample();

    // Demonstrate exec
    printf("\nDemonstrating exec:\n");
    execExample();

    // Example of sleep
    printf("\nSleeping for 3 seconds...\n");
    sleep(3);
    printf("Awake!\n");

    return 0;
}
