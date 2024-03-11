/*create nested linked list for storing the student name in outer and 
subject name with marks in the inner node*/
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
   int option;
   struct node*start=NULL;
   do
   {
    printf("\n CHOOSE THE FOLLOWING OPTION");
    printf("\n 1.create list");// option to create
    printf("\n 2.display");
    printf("\n\nenter your option : ");
    scanf("%d",&option);
    while (getchar()!='\n'); // clear the input buffer.
    switch(option)
    {
        case 1: start=create(start);
                printf("linked list created");
                break;
        case 2: display(start);
                break;        
    }
   } while (option !=3);//TC=O(1)
   return 0;
}
//TC=O(n)*O(m)=O(n*m)
struct node *create(struct node *start)
{
    struct node*new_node,*end=start;
    char name[MAX_NAME];// varaible to store the name of student.
    while(1)//TC=O(n)
    {
        printf("\n enter @ to end");
        printf("\n enter the name of the student: ");
        fgets(name,MAX_NAME,stdin);
        name[strcspn(name,"\n")] = 0; // remove new line charecter.
        if(strcmp(name,"@")==0) //using @ to terminate the loop.
        {
            break;
        }
        new_node=(struct node*)malloc(sizeof(struct node));
        strcpy(new_node->data1,name);// storing the name in first data part.
        new_node->data2=marks();//TC=O(m)  // calling marks function to fill data2
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
//TC=O(m)
struct innode *marks(void)// internal linked list.
{
    struct innode*start=NULL,*new_node,*end=NULL;
    char Subject[MAX_NAME];// to store the subject name.
    int marks;// to store the marks.
    while(1)//TC=O(m)
    {
        printf("\n enter @ to end");
        printf("\n enter the name of the subject: ");
        fgets(Subject,MAX_NAME,stdin);
        Subject[strcspn(Subject,"\n")] = 0; // remove new line charecter.
        if(strcmp(Subject,"@")==0) // using @ to end the loop.
        {
            break;
        }
        printf("\n enter the marks: ");
        scanf("%d",&marks);
        while(getchar()!='\n');
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
    }
    return start;
}
//TC=O(n)*O(m)=O(n*m)
void display(struct node *start)// display function.
{
    struct node*ptr=start;//for outer node.
    struct innode*inptr;// for inner node.
    while(ptr!=NULL)//TC=O(n)
    {
        printf("%s:\n ",ptr->data1);//student name.
        inptr=ptr->data2;// entring to the inner node.
        while(inptr!=NULL)//TC=O(m)
        {
            printf(" %s - %d\n",inptr->subject,inptr->marks);// printing subject and marks.
            inptr=inptr->next; // moving to next.

        }
        ptr=ptr->next;// moving outer pointer to next.
    }
}

//TIMECOMPLEXETY=O(n*m)+O(n*m)=O(2(n*m))=O(n*m)


/*NEW LEARNINGS RELATED TO STRINGS.
   
   --name[strcspn(name,"\n")] = 0;  =====This is particularly useful when reading strings using fgets(), 
   which includes the newline character in the buffer if there's enough space.
    By removing the newline character, you ensure the string behaves correctly 
    for further processing, comparisons, or outputs, without unintended line breaks.
    
    strcspn(name, "\n")====== This function calculates the length of the initial segment of 
    name which does not contain any characters from "\n" (in this case, just looking 
    for the newline character).
    
    
     while(getchar()!='\n');===== The while(getchar() != '\n'); line is like telling your program,
     Keep eating characters until you hit the end of the line. This is really useful because it 
     cleans up any leftover stuff from when the user typed something, making sure the next time 
     you ask for input, it starts fresh without any leftovers messing things up.*/