/*qsn crete a circular linked list*/

#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node* createCLL(struct node * start, struct node *end,int size,int nums[]);
void display(struct node * start);
int main()
{
    struct node*start=NULL;
    struct node*end=NULL;
    int nums[]={1,2,3,45,6,-1};
    int size=sizeof(nums)/sizeof(nums[0]);
    start=createCLL(start,end,size,nums);
    display(start);

}
struct node* createCLL(struct node * start, struct node *end,int size,int nums[])
{
    struct node *new_node,*ptr;
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
        }
        else
        {
            end->next=new_node;
        }
        end=new_node;
    }
    if(end!=NULL) end->next=start;// making the list circular by pointing last node to starting.
    return start;
}
void display(struct node *start)
{
    if(start==NULL)
    {
        printf("empty list");
        return;
    }
    struct node*ptr=start;
    do
    {
    printf("%d ",ptr->data);
    ptr=ptr->next;
    }while(ptr!=start);
}
