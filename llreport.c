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

//node to store classaverage of subjects
struct classaverage
{
    char subject[MAX_NAME];
    float avg;
    int count;
    struct classaverage*next;
};

//innner node to store the subject with respective marks.
struct innode
{
    char subject[MAX_NAME];
    int marks;
    struct innode *next;
};

//outter node to store name,subject wise marks,totals.
struct node 
{
    char name[MAX_NAME]; 
    struct innode *marksHead;
    struct node *next;
    int total;
};

//function prototypes.
struct node *create(struct node**start,char*name);
void marks(struct node*student,char*subject,int mark);
void display(struct node *start);
void topper(struct node *start);
void average(struct node*start, struct classaverage **avgstart);
void display_average(struct classaverage*start);
void averagecal(struct classaverage **avgstart, char *subject,int mark);
void fail(struct node *start);
void sort_average(struct classaverage **avgstart);
void sort_students(struct node **start);

//creating the outter node.
//TC=O(1)
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

//creating the inner node.
//TC=O(1)
void marks(struct node *student, char *subject, int mark) 
{
    struct innode *new_mark = (struct innode *)malloc(sizeof(struct innode));
    strcpy(new_mark->subject, subject);
    new_mark->marks = mark;
    new_mark->next = student->marksHead;
    student->marksHead = new_mark;
    student->total+=mark;
}

// displaying the otternode and inner node.
//TC=O(M*N)
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

// main function.
int main() 
{
    struct node *start = NULL;
    struct classaverage *avgstart = NULL;

    //all the inputs to the code.
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
      
  
    //all the calling funtions.
    printf("MARKS SHEET\n");
    display(start);//TC=O(M*N)
    printf("\n");
    topper(start);//TC=O(n)
    printf("\n");
    printf("SUBJECT WISE CLASS AVERAGE\n");
    average(start,&avgstart);//TC=O(N*M)
    display_average(avgstart);//TC=O(n)
    printf("\n");
    printf("FAILED STUDENTS\n");
    fail(start); //TC=O(n*m)
    printf("\n");
    printf("SUBJECT AVERAGES IN ORDER\n");
    sort_average(&avgstart);//TC=O(n^2)
    display_average(avgstart);//TC=O(n)
    printf("\n");
    printf("STUDENTS IN ORDER WITH RESPECTIVE TO THEIR TOTALS\n");
    sort_students(&start);//TC=O(n^2)
    display(start);//TC=O(M*N)
    

    return 0;
}

// to display the topper with name and marks.
//TC=O(n)
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
    //test case if there are more than one topper.
    while(temp!=NULL)
    {
        if(temp->total==max)
        {
            printf("%s\n",temp->name);
        }
        temp=temp->next;
    }

}

//creation of node for average calculation.
//TC=O(1)
void averagecal(struct classaverage **avgstart, char *subject,int mark)
{
    struct classaverage*temp=*avgstart;
    struct classaverage*prev=NULL;

    //updation of prev and temp.
    while(temp!=NULL&&strcmp(temp->subject,subject)!=0)
    {
        prev = temp;
        temp = temp->next;
    }
    // creation of node.
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
    //the marks of the particualr subject are added.
    else
    {
        temp->avg+=mark;
        temp->count++;// counting how many times that subject is occured.
    }
}

// calcualtion of the average.
//TC=O(N*M)
void average(struct node*start, struct classaverage **avgstart)
{
    struct node *temp=start;
    while(temp!=NULL)
    {
        struct innode *markTemp = temp->marksHead;
        while(markTemp!=NULL)
        {

            averagecal(avgstart,markTemp->subject,markTemp->marks);//TC=O(1)
            markTemp=markTemp->next;
        }
        temp=temp->next; 
    }
    struct classaverage *avgnode=*avgstart;
    while(avgnode!=NULL)
    {
        avgnode->avg=avgnode->avg/avgnode->count;// dividing the total with the count(sum of ob)/(no of ob)
        avgnode=avgnode->next;
    }
}

// displaying the class averages subject wise.
//TC=O(n)
void display_average(struct classaverage*start)
{
    struct classaverage*temp=start;
    while(temp!=NULL)
    {
        printf("subject: %s, average: %.2f\n",temp->subject,temp->avg);
        temp=temp->next;
    }
}

// student failing in atlest one subject.
//TC=O(n*m)
void fail(struct node *start) 
{
    struct node *temp = start;
    while (temp != NULL) {
        struct innode *markTemp = temp->marksHead;
        while (markTemp != NULL) 
        {
            if(markTemp->marks<40)
            {
                printf("%s\n",temp->name);
                break;
            }
            markTemp=markTemp->next;
        }
        temp=temp->next;
    }
}
 
// sorting the class average o subjects in descinding order.
//TC=O(N^2)
void sort_average(struct classaverage **avgstart)
{
    if(*avgstart==NULL || (*avgstart)->next==NULL)
    {
        printf("NO NODES AVAILABLE");
        return ;
    }
    struct classaverage *current,*index=NULL;
    float tempavg;
    int tempcount;
    char tempsubject[MAX_NAME];
    for(current=*avgstart;current!=NULL;current=current->next)
    {
        for(index=current->next;index!=NULL;index=index->next)
        {
            if(current->avg<index->avg)
            {
                tempavg=current->avg;
                current->avg=index->avg;
                index->avg=tempavg;

                tempcount=current->count;
                current->count=index->count;
                index->count=tempcount;

                strcpy(tempsubject,current->subject);
                strcpy(current->subject,index->subject);
                strcpy(index->subject,tempsubject);

            }
        }
    }

}

//sorting of students according to their totals in descinding order.
//TC=O(N^2)
void sort_students(struct node **start)
{
    if(*start==NULL||(*start==NULL))
    {
        printf("NO NODES AVAILABLE");
        return;
    }
    struct node *current,*index=NULL;
    int temptotal;
    char tempname[MAX_NAME];
    struct innode*tempmarkshead;
    for(current=*start;current!=NULL;current=current->next)
    {
        for(index=current->next;index!=NULL;index=index->next)
        {
            if(current->total<index->total)
            {
                temptotal=current->total;
                current->total=index->total;
                index->total=temptotal;

                strcpy(tempname,current->name);
                strcpy(current->name,index->name);
                strcpy(index->name,tempname);

                tempmarkshead=current->marksHead;
                current->marksHead=index->marksHead;
                index->marksHead=tempmarkshead;

            }
        }
    }
}

//TIMECOMPLIXIXTY=O(n^2)+O(M*N).

/*Pros of Linked List Approach:

Dynamic size: Can easily grow or shrink without reallocating the entire structure.
Easy insertion/deletion: Can add or remove elements without shifting the rest of the data.


Cons of Linked List Approach:

Slower access: Must traverse from the head to reach an element, O(n) access time vs. O(1) for arrays.
Extra memory: Each node requires additional memory for the pointer(s).


Pros of Array Approach:

Fast access: Direct indexing allows O(1) access time.
Memory efficiency: Only the data itself is stored, no extra pointers.


Cons of Array Approach:

Fixed size: Must know the maximum size in advance or reallocate the entire array to resize.
Costly insertion/deletion: Generally requires shifting elements, which is O(n) operation.*/

/*SOME POINTS TO SUMMARISE THE THINGS.
averagecal Function: This is where you're noting down the apple weights (marks) as vendors bring them. 
For each subject (apple type), you either add a new entry to your list or update an existing one by adding the new marks 
(weight) and incrementing the count.
average Function: Once all data is collected (all students' marks are noted), this function calculates
 the average marks for each subject. It does so by going through each entry in your list (each subject), 
 dividing the total marks by the count of students, and updating the average marks accordingly.*/