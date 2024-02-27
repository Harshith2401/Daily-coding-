#include<limits.h>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define MAX_NAME 50
struct innode
{
    char subject[MAX_NAME];
    int marks;
    struct innode *next;
};
struct node// creating node of two data parts.
{
    char data1[MAX_NAME];// node 1 is charecter type.
    struct innode*data2;
    struct node*next;
};
struct node *create(struct node *start);// function to create the outer linked list.
struct node *marks(void);// function to create the inner linked list.
void display(struct node *start);
int main()
{
   int option;
   struct node*start=NULL;
   do
   {
    printf("\n 1.create list");// option to create
    printf("\n 2.display");
    printf("\n\nenter your option : ");
    scanf("%d",&option);
    switch(option)
    {
        case 1: start=create(start);
                printf("linked list created");
                break;
        case 2: display(start);
                break;        
    }
   } while (option !=3);
   return 0;
}
struct node *create(struct node *start)
{
    struct node*new_node,*end=start;
    char name[MAX_NAME];// varaible to store the name of student.
    while(1)
    {
        printf("\n enter @ to end");
        printf("\n enter the name of the student: ");
        fgets(name,MAX_NAME,stdin);
        if(strcmp(name,"@")==0) 
        {
            break;
        }
        new_node=(struct node*)malloc(sizeof(struct node));
        strcpy(new_node->data1,name);// storing the name in first data part.
        new_node->data2=marks();// to store the second data part we need to call the marks
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
struct node *marks()// internal linked list.
{
    struct innode*start=NULL,*new_node,*end=NULL;
    char Subject[MAX_NAME];// to store the subject name.
    int marks;// to store the marks.
    while(1)
    {
        printf("\n enter @ to end");
        printf("\n enter the name of the subject: ");
        fgets(Subject,MAX_NAME,stdin);
        if(strcmp(Subject,"@")==0) 
        {
            break;
        }
        printf("enter the marks");
        scanf("%d",&marks);
        new_node=(struct node*)malloc(sizeof(struct innode));
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
    return start;
}
void display(struct node *start)// display function.
{
    struct node*ptr=start;
    struct innode*inptr;
    while(ptr!=NULL)
    {
        printf("%c ",ptr->data1);
        inptr=ptr->data2;
        while(inptr!=NULL)
        {
            printf("%c - %d",inptr->subject,inptr->marks);
            inptr=inptr->next;

        }
        ptr=ptr->next;
    }
}