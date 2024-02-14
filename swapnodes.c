#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*next;
};
struct node*create(struct node*start,struct node *end,int nums[],int size);
void swap(struct node**start);
void display(struct node *start);
int main()
{
    int nums[]={1,2,3,4,5,6,7,-1};
    int size=sizeof(nums)/sizeof(nums[0]);
    struct node *start=NULL;
    struct node*end=NULL;
    start=create(start,end,nums,size);
    swap(&start);
    display(start);
    return 0;
}
struct node *create(struct node *start,struct node *end,int nums[],int size)
{
    struct node*new_node,*ptr;
    for(int i=0;i<size;i++)
    {
        if(nums[i]==-1)
        {
            break;
        }
        new_node=(struct node*)malloc(sizeof(struct node));
        new_node->data=nums[i];
        new_node->next=NULL;
        if(start==NULL)
        {
            start=new_node;
            end=new_node;
        }
        else
        {
            end->next=new_node;
            end=new_node;
        }
    }
    return start;
}
void swap(struct node**start)
{
    if(*start==NULL||(*start)->next==NULL)// empty list and checking the next node is ther eor not to swap.
    {
        return;
    }
    struct node*prev=NULL;
    struct node*curent=*start;
    struct node*next=NULL;
    while(curent!=NULL&&curent->next!=NULL)
    {
        next=curent->next;// the next node.
        curent->next=next->next;//point current node to the node after next.
        next->next=curent;//swap curent and next nodes.
        if(prev==NULL)
        {
            *start=next;// for the first swap
        }
        else
        {
            prev->next=next;// lnking prevois paie with curent pair.
        }
        prev=curent;
        curent=curent->next;
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