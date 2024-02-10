/*qsn crete a circular linked list*/

#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node* createCLL(struct node * start, struct node *end,int size,int nums[]);
struct node *create(struct node *start,struct node *end ,int nums[],int size);
int iscircular(struct node*start);
int count=0;
struct node*start=NULL;
struct node*end=NULL;
int main()
{
    int count;
    int nums[]={1,2,3,45,6,-1};
    int size=sizeof(nums)/sizeof(nums[0]);
    start=createCLL(start,end,size,nums);
    start=create(start,end ,nums,size);
    iscircular(start);
}
struct node* createCLL(struct node * start, struct node *end,int size,int nums[])
{
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
        count++;
    }
    if(end!=NULL) end->next=start;// making the list circular by pointing last node to starting.
    return start;
}
struct node *create(struct node *start,struct node *end ,int nums[],int size)
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
int iscircular(struct node*start)
{


    if(end->next==start)
    {
        printf("true");// if the given list is circular linked list.
        return 0;
    }
    else
    {
        printf("false");// if the given list is not circular linked list.
        return 0;
    }
    return 0;
}



