/*qsn crete a circular linked list*/

#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node* createCLL(int size,int nums[]);
struct node *create(int nums[],int size);
struct node*start=NULL;
struct node*end=NULL;
int main()
{
    int count;
    int nums[]={1,2,3,45,6,-1};
    int size=sizeof(nums)/sizeof(nums[0]);
    start1=createCLL(size,nums);
    start2=create(nums,size);
}
struct node* createCLL(int size,int nums[])// creating circular linked list
{
    struct node *start=NULL;
    struct node *end=NULL;
    struct node *new_node;
    for(int i=0;i<size;i++)
    {
        if(nums[i]==-1)
        {
            break;
        }
        new_node=(struct node*)malloc(sizeof(struct node));
        new_node->data=nums[i];
        new_node->next=start;// moving the start
        if(start==NULL)
        {
            start=new_node;
            end=new_node;
        }
        else
        {
            end->next=new_node;
        }
        end=new_node;
    }
    if(end!=NULL) end->next=start;// making the list circular by pointing last node to starting.
    return start;
    if(end!=NULL&&end->next==start)// checking if it is circular or not.


    {
        printf("true");// if the given list is circular linked list.
    }
    else
    {
        printf("false");// if the given list is not circular linked list.
    }
}
struct node *create(int nums[],int size)// creating linked list.
{
    struct node *new_node,*ptr;
    struct node *start=NULL;
    struct node *end=NULL;
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
            end=new_node;// end node to track the last node.

        }
        else // or append the node to the next to the present node.
        {
            end->next=new_node;
            end=new_node;
        }
    }
    if(end!=NULL&&end->next==start)// checking if it is circular or not.
    {
        printf("true");// if the given list is circular linked list.
    }
    else
    {
        printf("false");// if the given list is not circular linked list.
    }
    return start;
}




