/*
This program uses circular linked list like structure to implement the following operations:
- Insert from the beginning
- Insert form ending
- Insert at any position
- Delete from beginning
- Delete at any position
- Delete at end
- Print the linked list in reversed and froward traversal
 */
package DSA.personel.circularlinkedlist;
import java.util.*;
public class circularlinkedlistuse {
    static Node head=null;
    static Node tail=null;

    public static void insertAtEnd(int n)
    {
        Scanner sc=new Scanner(System.in);
        int data;
        int i=0;

        while(i<n)
        {
            data=sc.nextInt();
            Node newNode=new Node(data);

            if(head==null)
            {
                head=newNode;
                tail=newNode;
                tail.next=head;
                head.previous=tail;
            }
            else
            {
                tail.next=newNode;
                Node temp=tail;
                tail=newNode;
                tail.previous=temp;
                tail.next=head;
                head.previous=tail;
            }
            i++;
        }
    }

    public static void insertAtBegin(int n)
    {
        Scanner sc=new Scanner(System.in);
        int data;
        int i=0;

        while(i<n)
        {
            data=sc.nextInt();
            Node newNode=new Node(data);

            if(head==null)
            {
                head=newNode;
                tail=newNode;
                tail.next=head;
                head.previous=tail;
            }
            else
            {
                tail.next=newNode;
                Node temp=tail;
                tail=newNode;
                tail.previous=temp;
                tail.next=head;
                head.previous=tail;
            }
            i++;
        }
    }
    public static void print()
    {
        System.out.println("List in normal traverse:");
        Node temp=head;
        do
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("\nList in reverse traversal:");
        temp=tail;
        do
        {
            System.out.print(temp.data+" ");
            temp=temp.previous;
        }while(temp!=tail);

    }

    public static void main(String[] args) {
        insertAtEnd(4);
        print();

    }
}
