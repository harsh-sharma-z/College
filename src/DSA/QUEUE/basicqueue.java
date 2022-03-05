/*
This following program implements a queue using linked list.
The program has two member functions :
insert(): to insert the elements into the queue
delete(): to delete elements out of the queue
 */

package DSA.QUEUE;
import java.util.*;
public class basicqueue {
    static Node front=null;
    static Node rear=null;

    public static void insert(int data)
    {
        Node newNode=new Node(data);
        if(front ==null)
        {
            front=newNode;
            rear=front;
        }
        else
        {
            rear.next=newNode;
            rear=newNode;
        }
    }
    public static int delete() {
        int ans=0;
        if(front==null)
        {
            System.out.println("Empty");
        }
        else
            if(front==rear)
            {
                ans=front.data;
                front=null;
                rear=null;
            }
            else
            {
                ans=front.data;
                front=front.next;
            }
            return ans;
    }

    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);

        System.out.println(delete()+" "+delete()+" "+delete());
    }




}
