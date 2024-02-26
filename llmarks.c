
#include<stdio.h>
#include<stdlib.h>
struct node
{
    char data1;
    int data2;
    struct node*next;
};
struct node *create(struct node *start,struct node *end,char *nums[],int size);
struct node *marks(struct node *start,struct node *end,char *nums1[],int nums2[],int size1,int size2);
int main()
{
   int option;
   do
   {
    printf("\n 1.create list");
    printf("\n 2.display");
    printf("\n\nenter your option : ");
    scanf("%d",&option);
    switch(option)
    {
        case 1: start=create(start);
                printf("linked list created");
                break;
        case 2: start=display(start);
                break;        
    }
   } while (option !=3);
   return 0;
}
struct node *create(struct node *start,struct node *end,char *nums[],int size)
{
    struct node*new_node,*ptr;
    for(int i=0;i<size;i++)
    {
        if(nums[i]==-1)
        {
            break;
        }
        new_node=(struct node*)malloc(sizeof(struct node));
        new_node->data1=nums[i];
        new_node->data2=marks(*nums1,*nums2,sie1,size2);
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
struct node *marks(struct node *start,struct node *end,char *nums1[],int nums2[],int size1,int size2)
{
    struct node *new,*ptr;
    for(int i=0,i<size1;i++)
    {
        if(nums1[i]==-1)
        {
            break;
        }
        new=(struct node*)malloc(sizeof(struct node));
        new->data1=nums1[i];
        new->data2=nums2[i];
        new->next=NULL;
        if(start==NULL)
        {
            start=new;
            end=new;
        }
        else
        {
            end->next=new;
            end=new;
        }

    }
    return start;
}