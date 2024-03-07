/*Given two lists sorted in increasing order, 
create and return a new list representing the intersection of 
the two lists. The new list should be made with its own memory 
- the original lists should not be changed.*/
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node*firstlist=NULL;
struct node*secondlist=NULL;
struct node*intersection=NULL;
struct node *create(struct node**start,int new_data);
void intersection_of_ll();
void display(struct node *start);
int main()
{
    // giving the linked list.
    create(&firstlist,1);
    create(&firstlist,22);
    create(&firstlist,55);
    create(&firstlist,69);
    create(&firstlist,99);
    create(&firstlist,55);

    create(&secondlist,1);
    create(&secondlist,2);
    create(&secondlist,3);
    intersection_of_ll();
    display(intersection);
    return 0;
}
// creation of linked list.
struct node *create(struct node **start,int new_data)
{
    struct node* new_node,*ptr,*end;
    new_node=(struct node*)malloc(sizeof(struct node));
    new_node->data=new_data;
    new_node->next=NULL;
    if(*start==NULL)
    {
        *start=new_node;
        end=new_node;
    }
    else
    {
        end->next=new_node;
        end=new_node;
    }
    return *start;
}

// inter section of linked list.
void intersection_of_ll()
{
    struct node*ptr1,*ptr2;
    ptr1=firstlist;
    while(ptr1!=NULL)// outer loop
    {
        ptr2=secondlist;
        while(ptr2!=NULL)// inner loop
        {
            if(ptr1->data==ptr2->data)
            {
                create(&intersection,ptr1->data);
                break;// to avoid dulplicates.
            }
            ptr2=ptr2->next;
        }
        ptr1=ptr1->next;
    }
}
// displaying the nodes.
void display(struct node *start)
{
    struct node*ptr;
    ptr=start;
    if(start==NULL)
    {
        printf("no elements in common");// when there is no intersection.
    }
    else
    {
        while(ptr!=NULL)
        {
            printf("%d ",ptr->data);
            ptr=ptr->next;
        }
    }
}