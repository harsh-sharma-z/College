/*
The following code uses double linked list based node.
And have specific function to perform:
- insertion at beginning
- insertion at ending
- insertion at any user given position
- deletion at end
- deletion at beginning
- deletion at any user given position
- printing the list in forward and reverse traversal.
 */
package DSA.personel.doublylinkedlist;

import java.util.*;
public class doublylinklistuse {
    static Node head=null;
    static Node tail=null;

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
            }
            else
            {

                head.previous=newNode;
                Node temp=head;
                head=newNode;
                head.next=temp;
            }
            i++;
        }
    }

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
                    head = newNode;
                    tail=newNode;
                }
                else
                {
                    Node temp=tail;

                    tail.next=newNode;
                    tail=newNode;
                    tail.previous=temp;
                }
                i++;
            }
        }

        public static void insertAtPos(int data,int pos)
        {
            Node newNode=new Node(data);
            Node tempNode=head;
            if(pos==0)
            {
                head.previous=newNode;
                Node temp=head;
                head=newNode;
                head.next=temp;
                return;
            }
            else
            {
                int i=0;
                while(i<pos-1)
                {
                    tempNode=tempNode.next;
                    i++;
                }
                Node temp2=tempNode.previous;
                temp2.next=newNode;
                newNode.next=tempNode;
                tempNode.previous=newNode;
                newNode.previous=temp2;
            }

        }


        public static void deleteAtEnd()
        {
            if(head==null)
                System.out.println("List is empty.");
            else
                if(head==tail)
                {
                    head=null;
                    tail=null;
                }
                else
                {
                    tail=tail.previous;
                    tail.next=null;

                }
        }

        public static void deleteAtBegin()
        {
            if(head==null)
                System.out.println("List is empty.");
            else
            if(head==tail)
            {
                head=null;
                tail=null;
            }
            else
            {
                head=head.next;
                head.previous=null;
            }

        }

        public static void deleteAtPos(int pos)
        {
            if(head==null)
                System.out.println("List is empty");
            else
                if(head==tail)
                {
                    if(pos>0)
                        System.out.println("Invalid Position");
                    else
                    {
                        head=null;
                        tail=null;
                    }
                }
                else
                {
                    int i=0;
                    Node temp=head;
                    while(i<pos-1 )
                    {

                        if(temp.next==null)
                        {
                            if(i<pos-1)
                            {
                                System.out.println("Invalid position");
                                return;
                            }
                        }
                        temp=temp.next;
                        i++;

                    }
                    Node temp2=temp.next.next;
                    temp.next=temp2;
                    temp2.previous=temp;

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
            }while(temp!=null);
            System.out.println("\nList in reverse traversal:");
            temp=tail;
            do
            {
                System.out.print(temp.data+" ");
                temp=temp.previous;
            }while(temp!=null);

        }

    public static void main(String[] args)
    {
        insertAtEnd(8);
        insertAtBegin(4);
        insertAtPos(69,4);
        System.out.println("Before deletion:");
        print();
        deleteAtEnd();
        deleteAtBegin();
        deleteAtPos(4);
        System.out.println("\n\nAfter deletion:");
        print();
    }
}
