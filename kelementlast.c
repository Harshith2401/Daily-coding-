/*qsn :

given a LinkedIn list, find the kth element from last without calculating the size.*/
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
struct node *create(struct node *start,struct node *end,int nums[],int size);
void find_k(struct node *start);
int main()
{
    struct node *start=NULL;
    int count,mid;
    struct node *end=NULL;
    int nums[]={1,5,8,9,6,4,-1};
    int size=sizeof(nums)/sizeof(nums[0]);
    start=create(start,end,nums,size);
    find_k(start);
}
// funtion to create list of nodes.
//TC=O(n)
struct node *create(struct node *start,struct node *end ,int nums[],int size)
{
    struct node *new_node,*ptr;
    int num;
    for(int i=0;i<size;i++)//TC=O(n)
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
    return start;
}
// finding out mid function.
//TC=O(n)
void find_k(struct node *start)
{
    if(start==NULL)
    {
        printf("empty list");// empty list.
        return;
    }
    struct node*fast=start;
    struct node*slow=start;
    int index=0;
    int k=6;
    while(fast!=NULL)//TC=O(n)
    {
        if(index>=k)// after fast reaching the index then only slow will move starting.
        {
            slow=slow->next;
        }
        fast=fast->next;
        index++;
    }
    printf("%d",slow->data);
}
//TIMECOMPLIXITY=O(n)+O(n)=O(2n)=O(n)