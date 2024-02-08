#include<stdio.h>
#include<stdlib.h>
struct node
{
    struct node*prev;// prev part as the double ll as three parts.
    int data;
    struct node*next;
};
struct node*create(struct node*start,struct node*end,int nums[], int size);
void display(struct node*);
int main()
{
    struct node*start=NULL;
    struct node*end=NULL;
    int nums[]={1,2,3,4,5,6,-1};
    int size=sizeof(nums)/sizeof(nums[0]);
    start=create(start,end,nums,size);
    display(start);
}
struct node*create(struct node*start,struct node*end,int nums[], int size)
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
            new_node->prev=NULL;// intilising the prev to the first node.
        }
        else
        {
            end->next=new_node;
            new_node->prev=end;// making the attachment to the previous node.
        }
        end=new_node;
    }
    return start;
}
void display(struct node*start)
{
    if(start==NULL)// empty list condition.
    {
        printf("empty list");
        return;
    }
    struct node*ptr;
    ptr=start;
    while(ptr!=NULL)
    {
        printf("%d ",ptr->data);
        ptr=ptr->next;
    }
    return;
}