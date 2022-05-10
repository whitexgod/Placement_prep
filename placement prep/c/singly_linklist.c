#include <stdio.h>
#include <stdlib.h>

//defining the structure of the node
struct node
{
    int data;
    struct node *next;
};
void options()
{
    printf("\nEnter 1 to make a new node.");
    printf("\nEnter 2 to delete a node from last.");
    printf("\nEnter 3 to display the Linklist.");
    printf("\nEnter 4 to display the number of nodes in the current Linklist.");
    printf("\nEnter 0 to terminate the program.\n");
}

void main()
{
    struct node *head, *newNode, *temporaryPointer, *temp;
    head=0;
    int active=1;
    do
    {
        int choice;
        options();
        scanf("%d",&choice);
        switch (choice)
        {
        case 1:
            newNode=(struct node*)malloc(sizeof(struct node));
            printf("\nEnter data to insert : ");
            scanf("%d",&newNode->data);
            newNode->next=0;
            if(head==0)
            {
                head=temporaryPointer=newNode;
            }
            else if(head !=0)
            {
                temporaryPointer->next=newNode;
                temporaryPointer=newNode;
            }
            break;
        case 2:
            printf("\nDeleting a node of the Linklist.\n"); 
            if(head==0)
            {
                printf("\nThe Linklist is Empty.\n");
            }
            else if(head==temporaryPointer)
            {
                printf("\nDeleting the only node present in the Linklist.\n");
                head=0;
            }
            else{
                temp=head;
                while(temp->next != temporaryPointer)
                {
                    temp=temp->next;
                }
                temporaryPointer=temp;
                temporaryPointer->next=0;
            }
            break;
        case 3:
            if(head==0)
                printf("\nNo Linklist found!\n");
            else{
                printf("\nThe nodes of the Linklist :\n");
                temporaryPointer=head;
                while (temporaryPointer->next != 0)
                {
                    printf("%d\t",temporaryPointer->data);
                    temporaryPointer=temporaryPointer->next;
                }
                printf("%d\t",temporaryPointer->data);
            }
            break;
        case 4:
            if(head==0)
            {
                printf("\nThe number of elements in the current Linklist is : %d",0);
            }
            else if(head==temporaryPointer)
            {
                printf("\nThe number of elements in the current Linklist is : %d",1);
            }
            else{
                int count=1;
                temp=head;
                while(temp->next != 0)
                {
                    ++count;
                    temp=temp->next;
                }
                printf("\nThe number of elements in the current Linklist is : %d",count);
            }
            break;
        case 0:
            printf("\nPROGRAM TERMINATED!\n");
            active=0;
            exit(0);
            break;
        
        default:
            printf("Choose from the above options.");
            break;
        }
    } while (active==1);    
}