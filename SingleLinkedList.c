#include <stdio.h>
#include<stdlib.h>

// user defined data type
struct node{
    int data;
    struct node *next;
    };

// Declaring node pointers

struct node *head; 
struct node *newnode, *temp;

int option;
// methods used for the single linked list

void create();
void display();
void insert_at_begin();
void insert_at_end();
void insert_after_pos();
void del_from_beginning();
void del_from_ending();
void del_from_pos();
void reverse();
int count_len();

void main()
{
    create();
    while(1){
    printf("\n Operations you can perform on the single linked list. \n");
    printf("1. Insert an element at the beginning of the list. \n");
    printf("2. Insert an element at the ending of the list. \n");
    printf("3. Insert an element after the specific position of the list. \n");
    printf("4. Delete an element at the beginning of the list. \n");
    printf("5. Delete an element at the ending of the list. \n");
    printf("6. Delete an element at the specific position of the list. \n");
    printf("7. Length of the current linked list \n");
    printf("8. Reverse the linked list \n");
    printf("9. Display the linked list \n");
    printf("WHAT OPERATION DO YOU WANT TO PERFORM FROM THE ABOVE: (1,2,3,4,5,6,7,8,9): \n");
    printf("Provide a number between [1-9]: 10 to exit: \n");
    
    scanf("%d",&option);
    switch(option)
    {
        case 1: insert_at_begin();
                break;
        case 2: insert_at_end();
                break;
        case 3: insert_after_pos();
                break;
        case 4: del_from_beginning();
                break;
        case 5: del_from_ending();
                break;
        case 6: del_from_pos();
                break;
        case 7: count_len();
                break;
        case 8: reverse();
                break;
        case 9: display();
                break;
        case 10: exit(1);
    }
}
}

void create(){
    int i,x;
    printf("\n Number of elements in the linked list: \n");
    scanf("%d", &x);
    for(i=1;i<=x;i++){
        newnode = (struct node*)malloc(sizeof(struct node));
        printf("Enter data for node %d of the linked list : ", i);
        scanf("%d", &newnode->data);
        newnode->next = NULL;
    
    if(head == NULL){
        head = temp = newnode;
    }
    else{
        temp = head;
        while(temp->next!=NULL)
            {
                temp = temp ->next;
            }
            temp ->next = newnode;
        }
    }
}

int count_len(){
    int count = 0;
    temp = head;
    while(temp!=NULL){
        temp = temp->next;
        count++;
    }
    printf("Length of the linked list : %d \n", count);
    return count;
}

void display(){
    if(head == 0){
        printf("\n Linked list is empty. \n");
        exit(1);
    }
    else{
       temp = head;
        printf("The current linked list: \n");
        while(temp!=NULL){
        printf("%d", temp->data);
        temp = temp->next;
    }
    }
}

void insert_at_begin(){
    newnode = (struct node*) malloc(sizeof(struct node));
    printf("\n Enter data to insert at the beginning: ");
    scanf("%d",&newnode->data);
    newnode ->next = head;
    head = newnode;
    printf("\n Data inserted at the beginning \n");
}

void insert_at_end(){
    newnode = (struct node*)malloc(sizeof(struct node));
    printf("\n Enter data to insert at the end: ");
    scanf("%d",&newnode->data);
    newnode ->next = NULL;
    
    temp = head;
    
    while(temp->next!=NULL){
        temp = temp -> next;
    }
    temp-> next = newnode;
        printf("\n Data inserted at the end \n");
    }
    
void insert_after_pos(){
    int pos;
    int count_check = count_len();
    printf("\n Enter the position after which you want to insert the element: ");
    scanf("%d", &pos);
    if(pos > count_check){
        printf("Invalid position");
    }
    else{
        int i=1;
        temp = head;
        while(i<pos)
            {
                temp = temp -> next;
                i++;
             }
        newnode = (struct node*)malloc(sizeof(struct node));
        printf("Enter the data you want to insert after %d position: ", pos);
        scanf("%d", &newnode->data);
        newnode->next = temp->next;
        temp->next = newnode;
            printf("\n Data inserted at the desired position \n");
    }
}

void del_from_beginning(){
    if(head == NULL){
        printf("\nUnderflow");
        }
    else{
        printf("\n Deleting from the beginning of the linked list\n");
        struct node *temp;
        temp = head;
        head = head->next;
        free(temp);
        printf("\n Deleted from the beginning \n ");
    }
}

void del_from_ending(){
    if(head == NULL){
        printf("\n Underflow");
    }
    else{
        struct node *temp, *prevnode;
        printf("\n Deleting at the end: \n");
        temp = head;
        while(temp->next != NULL){
            prevnode = temp;
            temp = temp-> next;
        }
        prevnode->next= NULL;
        free(temp);
        printf("\n Deleted from the ending \n ");
    }
}

void del_from_pos(){
    int pos=0, i=1;
    printf("Enter the position of the element you want to delete: ");
    scanf("%d", &pos);

    if(pos == 1){
        del_from_beginning();
    }
    else{
        struct node *nextnode;
        temp = head;
        while(i<pos-1){
            temp = temp-> next;
            i++;
        }
        nextnode = temp->next;
        temp->next = nextnode -> next;
        free(nextnode);
        printf("\n Deleted from desired position: \n ");
    }
}

void reverse(){
    printf("\n Reverse of the linked list: \n");
    struct node *nextnode, *prevnode, *currentnode;
    prevnode =0;
    currentnode = nextnode = head;
    while(nextnode!= NULL){
        nextnode = nextnode->next;
        currentnode->next = prevnode;
        prevnode = currentnode;
        currentnode = nextnode;
    }
    head = prevnode;
    printf("Reversal is complete");
    display();
}