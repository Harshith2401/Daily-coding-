/*qsn :

given a LinkedIn list, find the middle element without calculating the size.
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
void find_mid(struct node *start);
int main()
{
    struct node *start=NULL;
    int count,mid;
    struct node *end=NULL;
    int nums[]={-1};
    int size=sizeof(nums)/sizeof(nums[0]);
    start=create(start,end,nums,size);//TC of create()
    find_mid(start);//TC of find_mid()
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
void find_mid(struct node *start)//tc of this fuction is o(n)
{
    if(start==NULL)
    {
        printf("empty list");// empty list.
        return;
    }
    struct node*ptr=start;
    struct node*mid=start;
    while(ptr!=NULL&&ptr->next!=NULL)// AS PTR MOVES TWO NODES AT A TIME TO ELMINATE THE OUT OF BOUND ERROR WE NEED TO CHECK THE TWO NODES.
                                    //TC=O(n/2)==o(n)
    {
        // counting the number of nodes to find the mid.
        ptr=ptr->next->next;
        mid=mid->next;
    }
    printf("%d",mid->data);
}
//TIME COMPLEXITY=O(n)+O(n)=O(2n)=O(n)