#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*next;
};
struct node*create(struct node*start,struct node *end,int nums[],int size);
void swap(struct node*start,int size,int nums[]);
void display(struct node *start);
int main()
{
    int nums[]={1,2,3,4,5,6};
    int size=sizeof(nums)/sizeof(nums[0]);
    struct node *start=NULL;
    struct node*end=NULL;
    start=create(start,end,nums,size);
    swap(start);
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
void swap(struct node*start,int size,int nums[])
{
    int temp;
    struct node*ptr1=start;
    struct node*ptr2=start->next;
    for(int i=1;i<=(size/2);i++)
    {
        temp=ptr1->data;
        ptr1->data=ptr2->data;
        ptr1->data=temp;
        ptr1->next->next;
        ptr2->next->next;
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