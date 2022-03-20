/*
Basic program of a linked list with a Node class
and the following functions:
-insert at beginning
-insert at position
 */

package DSA.College;


import java.util.*;
class Node
{
    int data;
   Node next;
    Node(int data)
    {
        this.data=data;
    }
}
public class linklist {
    static Node head;
    public static void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void deleteAtPos(int pos)
    {
        if(head==null)
            return;
        else
        {
            if(head.next==null)
            {
                if(pos!=1)
                    System.out.println("Invalid Position");
                else
                    head=null;

            }
            else
            {
                int c=1;
                if(pos>count())
                {
                    System.out.println("Invalid Position");
                }
                else
                {
                 Node temp=head;
                    while(temp!=null)
                    {

                        if(c==pos-1)
                            break;
                        c++;
                        temp=temp.next;
                    }
                }
            }
        }
    }
    public static void insertAtbegin(int k)
    {
        Node newNode = new Node(k);
        newNode.next=head;
        head=newNode;
    }
    public static void insertAtEnd(int k)
    {
        Node newNode=new Node(k);
       Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp=newNode;
    }

    public static int count()
    {
        int c=0;
     Node temp=head;
        while(temp.next!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
    public static void insertAtPos(int pos,int data)
    {
      Node n=new Node(data);
        if(head==null) {
            if (pos > 1) {
                System.out.println("Invalid position");
            } else {
                head = n;
            }
        }
        else
        {
            if(pos>count()+1)
                System.out.println("Invalid position");
            else
            {
               Node temp=head;
                int c=1;
                while(temp.next!=null)
                {
                    if(c==pos-1)
                    {
                        break;
                    }
                    c++;
                    temp=temp.next;
                    temp.next=n;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

    Node n1=new Node(5);
        head=n1;
    Node n2=new Node(10);
        n1.next=n2;
       Node n3=new Node(15);
        n2.next=n3;
        insertAtbegin(20);
        insertAtbegin(40);
        insertAtbegin(100);
        insertAtEnd(69);
        insertAtPos(3,65);
        insertAtPos(3,75);
        print();
    }
}

/*
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class Main {
  Node head;
  public void insertAtBeg(int x){
    Node n = new Node(x);
    n.next=head;
    head=n;
  }
  public void insertAtEnd(int x){
    Node n = new Node(x);
    if(head==null){
      head = n;
    }
    else{
      Node temp = head;
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = n;
    }
  }
  public void deleteAtPos(int pos){
    if(head==null)
      return;
    else{
      if(head.next==null){
        if(pos!=1){
          System.out.println("Invalid position");
        }
        else
          head=null;
      }
      else{
        int c=1;
        if(pos>count())
          System.out.println("Invalid position");
        else{
          Node temp = head;
          while(temp!=null){
            if(c==pos-1){
              break;
            }
            c++;
            temp = temp.next;
          }
          temp.next=temp.next.next;
        }
      }
    }
  }
  public int count(){
    int c=0;
    Node temp = head;
    while(temp!=null){
      c++;
      temp = temp.next;
    }
    return c;
  }
  public void insertAtPos(int pos, int x){
    Node n = new Node(x);
    if(head==null){
      if(pos>1){
        System.out.println("invalid position");
      }
      else{
      head = n;
      }
    }
    else{
      if(pos==1){
        n.next=head;
        head=n;
      }
      else if(pos>count()+1){
        System.out.println("invalid position");
      }
      else{
        Node temp = head;
        int c=1;
        while(temp.next!=null){
          if(c==pos-1){
            break;
          }
          c++;
          temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
      }
    }
  }
    public static void main(String[] args) {
      Main obj = new Main();
      Node n1 = new Node(10);
      obj.head = n1;
      Node n2 = new Node(20);
      n1.next = n2;
      Node n3 = new Node(30);
      n2.next = n3;

      //obj.insertAtBeg(50);
      //obj.insertAtEnd(50);
      obj.insertAtPos(3,60);
      //obj.insertAtPos(3,80);
    }
}
 */
