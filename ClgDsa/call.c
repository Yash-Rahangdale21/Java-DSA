#include<sys/types.h>

#include<unistd.h>

#include<stdio.h>


void main()

{

pid_t n; 

n = fork();

printf("%d\n",n);

if(n==0)

{

printf("Child\n");

printf("pid of child: %d\n",getpid());

printf("pid of parent of child: %d\n",getppid());

}

else

{ printf("Parent\n");

printf("pid of parent is: %d\n",getpid()); 
printf("pid of child of parent is: %d\n",n);

}
}
