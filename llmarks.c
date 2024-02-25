
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
    char *nums[]={"harsh","harshu","harsha",-1};
    char *nums2[]={"c++","java","phython",-1};
    int nums[]={1,2,3,-1};
    int size=sizeof(nums)/sizeof(nums[0]);
    int size1=sizeof(nums1)/sizeof(nums1[0]);
    int size2=sizeof(nums2)/sizeof(nums2[0]);
    struct node*start=NULL;
    start=create(nums,size);
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