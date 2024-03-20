/*Tom Qsn : 
Add 10 students and 6 subjects and find: 

a ) Find the student who topped the class

b ) Average marks at subject level

c ) List of students who failed . < 40 marks fail in atleast 1 subject 

d ) Order of subjects with max avg score. First being most avg

e) Sort the students by their total score. 

f ) What's the difference between this approach and arrays approach . Pros and cons.*/
#include<limits.h>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define MAX_NAME 50
struct classaverage
{
    char subject[MAX_NAME];
    float avg;
    int count;
    struct classaverage*next;
};

struct innode
{
    char subject[MAX_NAME];
    int marks;
    struct innode *next;
};

struct node 
{
    char name[MAX_NAME]; 
    struct innode *marksHead;
    struct node *next;
    int total;
};

struct node *create(struct node**start,char*name);
void marks(struct node*student,char*subject,int mark);
void display(struct node *start);
void topper(struct node *start);

void average(struct node*start, struct classaverage **avgstart);
void display_average(struct classaverage*start);
void averagecal(struct classaverage **avgstart, char *subject,int mark);
struct node *create(struct node **start, char *name) 
{
    struct node *new_node=(struct node *)malloc(sizeof(struct node));
    strcpy(new_node->name, name);
    new_node->marksHead = NULL;
    new_node->next = NULL;
    new_node->total=0;

    if (*start == NULL) 
    {
        *start = new_node;
    } 
    else 
    {
        struct node *temp = *start;
        while (temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = new_node;
    }
    return new_node;
}

void marks(struct node *student, char *subject, int mark) 
{
    struct innode *new_mark = (struct innode *)malloc(sizeof(struct innode));
    strcpy(new_mark->subject, subject);
    new_mark->marks = mark;
    new_mark->next = student->marksHead;
    student->marksHead = new_mark;
    student->total+=mark;
}

void display(struct node *start) 
{
    struct node *temp = start;
    while (temp != NULL) {
        printf("Student: %s\n", temp->name);
        struct innode *markTemp = temp->marksHead;
        while (markTemp != NULL) 
        {
            printf("  %s: %d\n", markTemp->subject, markTemp->marks);
            markTemp=markTemp->next;
        }
        printf("total marks: %d\n\n",temp->total);
        temp=temp->next;
    }
}

int main() 
{
    struct node *start = NULL;
    struct classaverage *avgstart = NULL;

    struct node *harshith = create(&start, "harshith");
    marks(harshith, "c language", 85);
    marks(harshith, "c++", 100);
    marks(harshith, "python", 70);
    marks(harshith, "DBMS",100);
    marks(harshith, "DSA", 100);
    marks(harshith, "BEE", 100);

    struct node *vishal = create(&start, "vishal");
    marks(vishal, "c language", 85);
    marks(vishal, "c++", 100);
    marks(vishal, "python", 70);
    marks(vishal, "DBMS",100);
    marks(vishal, "DSA", 100);
    marks(vishal, "BEE", 100);

    struct node *munna = create(&start, "munna");
    marks(munna, "c language", 100);
    marks(munna, "c++", 100);
    marks(munna, "python", 100);
    marks(munna, "DBMS",100);
    marks(munna, "DSA", 100);
    marks(munna, "BEE", 100); 

    struct node *ramu = create(&start, "ramu");
    marks(ramu, "c language", 36);
    marks(ramu, "c++", 36);
    marks(ramu, "python", 36);
    marks(ramu, "DBMS",36);
    marks(ramu, "DSA", 36);
    marks(ramu, "BEE", 36);

    struct node *praveen = create(&start, "praveen");
    marks(praveen, "c language", 20);
    marks(praveen, "c++", 20);
    marks(praveen, "python", 20);
    marks(praveen, "DBMS",20);
    marks(praveen, "DSA", 20);
    marks(praveen, "BEE", 20);
      
  

    
    display(start);
    topper(start);
    average(start,&avgstart);
    display_average(avgstart);

    return 0;
}


void topper(struct node *start)
{
    int max=0;
    struct node *temp = start;
    while (temp != NULL) 
    {
        if(temp->total>max)
        {
            max=temp->total;
        }
       
        temp=temp->next;
    }
    printf("topper(s) with total marks: %d\n",max);
    temp=start;
    while(temp!=NULL)
    {
        if(temp->total==max)
        {
            printf("%s\n",temp->name);
        }
        temp=temp->next;
    }

}
void averagecal(struct classaverage **avgstart, char *subject,int mark)
{
    struct classaverage*temp=*avgstart;
    struct classaverage*prev=NULL;
    while(temp!=NULL&&strcmp(temp->subject,subject)!=0) 
    {
        prev = temp;
        temp = temp->next;
    }
    if(temp==NULL)
    {
        struct classaverage*newnode=(struct classaverage*)malloc(sizeof(struct classaverage));
        strcpy(newnode->subject,subject);
        newnode->avg=mark;
        newnode->count=1;
        newnode->next=NULL;
        if(*avgstart==NULL)
        {
            *avgstart=newnode;
        }
        else
        {
            prev->next=newnode;
        }
    }
    else
    {
        temp->avg+=mark;
        temp->count++;
    }
}
void average(struct node*start, struct classaverage **avgstart)
{
    struct node *temp=start;
    while(temp!=NULL)
    {
        struct innode *markTemp = temp->marksHead;
        while(markTemp!=NULL)
        {

            averagecal(avgstart,markTemp->subject,markTemp->marks);
            markTemp=markTemp->next;
        }
        temp=temp->next; 
    }
    struct classaverage *avgnode=*avgstart;
    while(avgnode!=NULL)
    {
        avgnode->avg=avgnode->avg/avgnode->count;
        avgnode=avgnode->next;
    }
}
void display_average(struct classaverage*start)
{
    struct classaverage*temp=start;
    while(temp!=NULL)
    {
        printf("subject: %s, average: %.2f\n",temp->subject,temp->avg);
        temp=temp->next;
    }
}
