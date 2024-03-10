// converting a array to linked list.
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
void display(struct node *start);
int main()
{
    struct node *start=NULL;
    struct node *end=NULL;
    int nums[]={1,2,3,4,5,-1};
    int size=sizeof(nums)/sizeof(nums[0]);
    start=create(start,end,nums,size);
    display(start);
}
// funtion to create list of nodes.
struct node *create(struct node *start,struct node *end ,int nums[],int size)
{
    struct node *new_node,*ptr;
    int num;
    for(int i=0;i<size;i++)// TC=O(n).
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
// display function.
void display(struct node *start)
{
    struct node*ptr;
    ptr=start;
    while(ptr!=NULL)// TC=O(n) .. here also n because of the number of elements.
    {
        printf("%d ",ptr->data);
        ptr=ptr->next;
    }
}
//TIME COMPLEXITY=n+n=2n== O(n).