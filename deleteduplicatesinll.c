// deleteing the duplicates in the list.

#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*next;
};
// function prtotypes.
struct node *create(struct node *start,struct node *end,int nums[],int size);
void duplicate(struct node **start );
void display(struct node *start);
int main()
{
    int nums[]={1,1,1,1,1,1,1,10,0,0,-1};
    int size=sizeof(nums)/sizeof(nums[0]);
    struct node*start=NULL;
    struct node*end=NULL;
    start=create(start,end,nums,size);
    duplicate(&start);
    display(start);
    return 0;
}
// function to create the list.
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
// function to delete the duplicates.
void duplicate(struct node **start)
{
    struct node *ptr=*start,*prev,*dup;
    while(ptr!=NULL&&ptr->next!=NULL)// outer loop for anchor pointer.
    {
        prev=ptr;// asigined to prev to make iteration easy.
        while(prev->next!=NULL)// inner loop to check the data part of anchor is there.
        {
            if(ptr->data==prev->next->data)
            {
                dup=prev->next;// asigining the node dup.
                prev->next=prev->next->next;// moving the pointers to forward.
                free(dup);// deleting
            }
            else
            {
                prev=prev->next;
            }
        }
        ptr=ptr->next;// iterating the anchor pointer.
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
