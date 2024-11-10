#include<stdio.h>
#include<stdlib.h>

struct node{
    struct node *leftchild;
    int data;
    struct node *rightchild;
};
struct node *getNode(int x){
    struct node *p = (struct node *) malloc(sizeof (struct node));
    if(p == NULL){
        printf("Not enough memory");
       return;
    }
    p -> data = x;
    p -> leftchild = NULL;
    p -> rightchild = NULL;
    return p;
}
int main(){
    struct node *root = NULL;
    root = getNode(10);
    root -> leftchild = getNode(20);
    root -> rightchild = getNode(30);
    root -> leftchild -> rightchild = getNode(20);
    root -> leftchild ->rightchild -> leftchild = getNode(20);
    
}