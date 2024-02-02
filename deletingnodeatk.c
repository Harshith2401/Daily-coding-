/*qsn :

given a LinkedIn list, delete the kth node without .*/
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
void deleting(struct node **start,int k);
void display(struct node *start);
int main()
{
    struct node *start=NULL;
    struct node *end=NULL;
    int nums[]={9,6,4,5,7,-1};
    int size=sizeof(nums)/sizeof(nums[0]);
    start=create(start,end,nums,size);
    int k=3;
    deleting(&start,k);
    display(start);
}
// funtion to create list of nodes.
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
// finding out mid function.
// used double pointer to directly modify the adrees stored in pointer. the relfections are possible.
void deleting(struct node **start ,int k)
{
    if(start==NULL)
    {
        printf("empty list");// empty list.
        return;
    }
     struct node*ptr=*start;
    if(k==1)
    {
        *start=ptr->next;// dletion for first node.
        free(ptr);
        return;

    }
    else
    {
        int i=1;
        struct node *ptr1=NULL;// keep track of previous nodes.
        while(ptr!=NULL&&i<k)
        {
            ptr1=ptr;// update prev to current
            ptr=ptr->next;
            i++;
        }
        if(ptr==NULL)
        {
            printf("the position is beyond list");// out of bound check
        }
        ptr1->next=ptr->next;// unlinking the the node to delete it
        free(ptr);
    }
}
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