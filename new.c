
#include<limits.h>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define MAX_NAME 50
// iner node for marks and subject.
struct innode
{
    char subject[MAX_NAME];
    int marks;
    struct innode *next;
};
// outer node.
struct node
{
    char data1[MAX_NAME];// node 1 is charecter type(student name)
    struct innode*data2;// pointer to point the marks 
    struct node*next;
};
// function prototypes.
struct node *create(struct node *start);// function to create the outer linked list.
struct innode *marks(void);// function to create the inner linked list.
void display(struct node *start);// display
int main()
{
   struct node *start = NULL;

    // Adding students and their marks directly
    start = create(start, "Alice");
    marks(start, "Math", 85);
    Marks(start, "Physics", 90);

    start = create(start, "Bob");
    Marks(start->next, "Math", 82);
    Marks(start->next, "Physics", 88);

    // Displaying the list
    display(start);

    return 0;
}
struct node *create(struct node *start)
{
    struct node*new_node,*end=start;
    char name[MAX_NAME];// varaible to store the name of student.
        
        new_node=(struct node*)malloc(sizeof(struct node));
        strcpy(new_node->data1,name);// storing the name in first data part.
        new_node->data2=marks();// calling marks function to fill data2
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
    return start;

}
struct node *marks(void)// internal linked list.
{
   
        
        new_node=(struct innode*)malloc(sizeof(struct innode));
        strcpy(new_node->subject,Subject);// enetring the subject name in first data part.
        new_node->marks=marks;// entering second data part as marks.
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
    
    return start;
}
void display(struct node *start)// display function.
{
    struct node*ptr=start;//for outer node.
    struct innode*inptr;// for inner node.
    while(ptr!=NULL)
    {
        printf("%s:\n ",ptr->data1);//student name.
        inptr=ptr->data2;// entring to the inner node.
        while(inptr!=NULL)
        {
            printf(" %s - %d\n",inptr->subject,inptr->marks);// printing subject and marks.
            inptr=inptr->next; // moving to next.

        }
        ptr=ptr->next;// moving outer pointer to next.
    }
}