#include<stdio.h>
#include<stdlib.h>
// creating the node data part and adresss part.
struct node
{
    int data;
    struct node *next;
};
struct node *start=NULL;// keeping start as null.

// finctions prototypes.
struct node *create(struct node *star,int nums[],int size);
void display(struct node *start);
int main()
{
    struct node *start=NULL;
    int nums[]={1,2,3,4,5,-1};
    int size=sizeof(nums)/sizeof(nums[0]);
    start=create(start,nums,size);
    display(start);
}
// funtion to create list of nodes.
struct node *create(struct node *star,int nums[],int size)
{
    struct node *new_node,*ptr;
    int num;
    for(int i=0;i<size;i++)
    {
        if(nums[i]==-1)// trminatimg the loop.
        {
            break;
        }
        new_node=(struct node*)malloc(sizeof(struct node));// dynamic memory allocation for new node.
        new_node->data=nums[i];// puting the element of array into the data part of the node.
        new_node->next=NULL; // next pointer to null to move it forward.
        if(start==NULL) // if the list empty make the first node as start.
        {
            start=new_node;
        }
        else // or append the node to the next to the present node.
        {
            ptr=start;// starting form the first node.
            while(ptr->next!=NULL) // traversing till the end node.
            {
            ptr=ptr->next;
            }
            ptr->next=new_node;// joining the node to the last node.
        }
    }
    return start;
}
// display function.
void display(struct node *start)
{
    struct node*ptr;
    ptr=start;
    while(ptr!=NULL)
    {
        printf("%d ",ptr->data);
        ptr=ptr->next;
    }
}