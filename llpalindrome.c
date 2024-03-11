/*if the single linked list is given we should check if it is linked list or not.
soo palindrome means if we read from front or back it should be same 
we can go only front in linked list the main constriant is that only 
but there is lead thyat backtracking yes if inserting the list is equal to backtracking then its palindrome.*/
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*next;
};
struct node *create(int nums[],int size);// creating list.
struct node*find_mid(struct node *start);// finding middle term
struct node*reverselist(struct node*start);// reversing the list.
int ispalindrome(struct node* start);// checking for palindrome
void l(struct node*start);// palindrome for two nodes.
int count;
int main()
{
    int nums[]={2,1,2,-1};
    int size=sizeof(nums)/sizeof(nums[0]);
    struct node*start=NULL;
    start=create(nums,size);
    ispalindrome(start);
    return 0;
}
// creating list
//TC=O(n)
struct node *create(int nums[],int size)
{
    struct node*new_node,*ptr,*start=NULL,*end=NULL;
    count =0;
    for(int i=0;i<size;i++)//TC=O(n)
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
        count ++;
    }
    return start;
}
// whe it has two nodes.
//TC=O(1)
void l(struct node*start)
{
    if(count==2)
    {
        if(start->data==start->next->data)
        {
            printf("true");
            return;
        }
        else
        {
            printf("false");
            return;
        }
    }
    return;
}
// finding the mid.
//TC=O(n/2)=O(n)
struct node*find_mid(struct node *start)
{
    if(start==NULL)
    {
        printf("empty list");// empty list.
        return 0;
    }
    struct node*ptr=start;
    struct node*mid=start;
    //TC=O(n/2)=O(n)
    while(ptr!=NULL&&ptr->next!=NULL)// AS PTR MOVES TWO NODES AT A TIME TO ELMINATE THE OUT OF BOUND ERROR WE NEED TO CHECK THE TWO NODES.
    {
        // counting the number of nodes to find the mid.
        ptr=ptr->next->next;
        mid=mid->next;
    }
    return mid;
}
// reversing the list.
//TC=O(n)
struct node*reverselist(struct node*start)
{
    struct node*prev=NULL,*current=start,*next=NULL;
    while(current!=NULL)//TC=O(n)
    {
        next=current->next;
        current->next=prev;
        prev=current;
        current=next;
    }
    return prev;
}
// checking the palindrome
//TC=O(n/2)=O(n)
int ispalindrome(struct node* start)
{
    if(count==2)
    {
        l(start);
        return 0;
    }
    if(!start || !(start->next))
    {
        printf("true");
        return 1;
    }
    struct node *middle=find_mid(start);
    struct node*secondhalf=reverselist(middle->next);
    if(middle->next!=NULL)
    {
        middle->next=NULL;
    }
    struct node*p1=start;
    struct node*p2=secondhalf;
    while(p1!=NULL&&p2!=NULL)//TC=O(n/2)=O(n)
    {
        if(p1->data!=p2->data)
        {
            printf("false");
            return 0;
        }
        p1=p1->next;
        p2=p2->next;
    }
    printf("true");
    return 1;
}
//TIMECOMPLIXIXTY=O(n)+O(1)+O(n)+O(n)+O(n)=O(4n)+O(1)=  O(n)