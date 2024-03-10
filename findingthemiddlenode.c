/*qsn :

given a LinkedIn list, find the middle element
if it's 1,2,3
show 2

if it's 1,2,3,4

show 3*/
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
void find_mid(struct node *start,int count,int mid);
int main()
{
    struct node *start=NULL;
    int count,mid;
    struct node *end=NULL;
    int nums[]={1,2,-1};
    int size=sizeof(nums)/sizeof(nums[0]);
    start=create(start,end,nums,size);
    find_mid(start,count,mid);
}
// funtion to create list of nodes.
struct node *create(struct node *start,struct node *end ,int nums[],int size)//tc of this fuction is o(n)
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
void find_mid(struct node *start,int count,int mid)//tc of this fuction is o(n)
{
    count=0;
    struct node*ptr;
    ptr=start;
    while(ptr!=NULL)//TC=O(n)
    {
        count++;// counting the number of nodes to find the mid.
        ptr=ptr->next;
    }
    if(count<=2)
    {
        printf("insuffusient nodes");
        return;
    }
    mid=count/2+1;// calculating mid.
    ptr=start;
    for(int i=1;i<=mid;i++)// iterating till mid.
    //TC=O(n/2)=O(n)
    {
        if(i==mid)// printing the node if its mid and exiting.
        {
            printf("%d",ptr->data);
            return;
        }
        ptr=ptr->next;
    }
}
//TIME COMPLEXITY=O(n)