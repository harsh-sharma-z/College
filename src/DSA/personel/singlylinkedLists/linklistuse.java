package DSA.personel.singlylinkedLists;
import java.util.*;

public class linklistuse {

    static Node head=null;
    static Node tail=null;
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

    public static  void AddatBegin(int n)
    {

        Scanner sc=new Scanner(System.in);
        int data;
        for(int i=0;i<n;i++)
        {
            if(head==null)
            {
                data=sc.nextInt();
                Node newNode=new Node(data);
                newNode.next=head;
                head=newNode;
                tail=head;
            }
            else
            {
                data = sc.nextInt();
                Node newNode = new Node(data);
                newNode.next = head;
                head = newNode;
            }


        }

    }
    public static void AddatPos(int data,int pos)
    {
        Node newNode=new Node(data);
        int i=0;
        Node temp=head;
        if(pos==0)
        {
            newNode.next=head;
            head=newNode;
            return;
        }
        while(i<pos-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public static void AddatEnd(int n)
    {

        Scanner sc=new Scanner(System.in);
        int data;
        int i=0;
        while(i<n)
        {
            data=sc.nextInt();
            Node newNode=new Node(data);

            if(head==null)
                head=newNode;
            else
            {
                tail.next=newNode;
                tail=newNode;
            }

            i++;
        }



    }

    public static void deleteatEnd()
    {
               if(head==null)
                   System.out.println("List Empty");
               else
                   if(head==tail)
                   {
                       head=null;
                       tail=null;
                   }
                   else
                   {
                       Node temp=head;
                       while(temp.next.next!=null)
                       {
                           temp=temp.next;
                       }
                       temp.next=null;
                   }
    }

    public static void deleteatBegin()
    {
         if(head==null)
             System.out.println("Empty List");
         else
             if(head==tail)
             {
                 head=null;
                 tail=null;
             }
             else
             {
                 head=head.next;
             }
    }
    public static void deletatPos(int n)
    {
        if(head==null)
            System.out.println("List is empty");
        else
            if(head==tail)
            {
                if(n>0)
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
                while(temp.next!=null && i<n-1)
                {
                    temp = temp.next;
                    i++;
                }
                temp.next=temp.next.next;
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        AddatBegin(n);
        //AddatEnd(n);
       // AddatPos(69,2);
        System.out.println("Before deletion:");
        print();
        deleteatEnd();
        System.out.println("After deletion:");
        print();

    }
}
