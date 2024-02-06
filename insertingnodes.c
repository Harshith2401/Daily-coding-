#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node *start=NULL;
struct node *create(struct node *start,struct node *end,int nums[],int size);
void insert(struct node *start,int nums2[],int k,int size1);
void display(struct node *start);
int main()
{
    struct node *start=NULL;
    struct node *end =NULL;
    int nums[]={1,2,3,4,45,6,-1};
    int nums1[]={1,2,3};
    int size1=sizeof(nums1)/sizeof(nums1[0]);
    int k=10;
    int size=sizeof(nums)/sizeof(nums[0]);
    start=create(start,end,nums,size);
    insert(start,nums1,k,size1);
    display(start);
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
void insert(struct node *start,int nums1[],int k,int size1)
{
    if(start==NULL)
    {
        printf("empty list");
        return;
    }
    struct node *new_node,*ptr=start,*preptr=start;
    int pos=1;
    while(pos<k&&ptr!=NULL)// updating ptr and preptr till k.
    {
        ptr=ptr->next;
        preptr=ptr;
        pos++;
    }
    if(pos!=k)
    {
        printf("position exceeds");
        return;
    }
    for(int i=0;i<size1;i++)
    {
        new_node=(struct node*)malloc(sizeof(struct node));
        new_node->data=nums1[i];
        if(preptr==NULL)// when insertion at begining.
        {
            new_node->next=start;
            start=new_node;
        }
        else
        {
            new_node->next=preptr->next;
            preptr->next=new_node;
        }
        preptr=new_node;
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

