/*
This programs implements a stack by singly linked list.
It has the following functions:
- push(): to enter elements into the stack
- pop(): to delete and take out elements from the list
- print(): to print the stack
 */

package DSA.personel.singlylinkedLists;

import java.util.Scanner;

public class stackusingLL {
    static Node head=null;
    static Node tail=null;
    public static void push(int n) {

        Scanner sc = new Scanner(System.in);
        int data;
        int i = 0;
        while (i < n) {
            data = sc.nextInt();
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = head;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }

            i++;
        }
    }
        public static void print( )
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;

            }
            System.out.println();
        }


    public static void pop()
    {
        if(head==null)
            System.out.println("List Empty");
        else
        if(head==tail)
        {
            System.out.println(head.data);
            head=null;
        }
        else
        {
            Node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            System.out.println(tail.data);
            temp.next=null;
            tail=temp;

        }
    }


    public static void main(String[] args) {
        push(5);
        System.out.println("The linked list is:");
        print();
        pop();
        pop();
        pop();
        pop();
        pop();
        pop();


    }
}
