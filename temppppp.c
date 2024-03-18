#include <limits.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_NAME 50

struct innode {
    char subject[MAX_NAME];
    int marks;
    struct innode *next;
};

struct node {
    char name[MAX_NAME]; // Corrected to a clearer variable name
    struct innode *marksHead; // Pointer to the first mark node
    struct node *next;
};

// Corrected function prototypes
struct node *create(struct node **start, char *name);
void addMarks(struct node *student, char *subject, int mark);
void display(struct node *start);

struct node *create(struct node **start, char *name) {
    struct node *new_node = (struct node *)malloc(sizeof(struct node));
    strcpy(new_node->name, name);
    new_node->marksHead = NULL;
    new_node->next = NULL;

    if (*start == NULL) {
        *start = new_node;
    } else {
        struct node *temp = *start;
        while (temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = new_node;
    }
    return new_node;
}

void addMarks(struct node *student, char *subject, int mark) {
    struct innode *new_mark = (struct innode *)malloc(sizeof(struct innode));
    strcpy(new_mark->subject, subject);
    new_mark->marks = mark;
    new_mark->next = student->marksHead;
    student->marksHead = new_mark;
}

void display(struct node *start) {
    // Simple display function to verify the structure
    struct node *temp = start;
    while (temp != NULL) {
        printf("Student: %s\n", temp->name);
        struct innode *markTemp = temp->marksHead;
        int sum=0;
        while (markTemp != NULL) 
        {
            printf("  %s: %d\n", markTemp->subject, markTemp->marks);
            sum=sum+markTemp->marks;
            markTemp = markTemp->next;
        }
        printf("%d\n",sum);
        temp = temp->next;
    }
}

int main() {
    struct node *start = NULL;

    struct node *alice = create(&start, "harsh");
    addMarks(alice, "Math", 85);
    addMarks(alice, "Physics", 90);

    struct node *bob = create(&start, "harshu");
    addMarks(bob, "Math", 82);
    addMarks(bob, "Physics", 88);

    // Displaying the list
    display(start);

    return 0;
}
