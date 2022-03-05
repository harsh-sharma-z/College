/*
This program uses linked list to create a stack of characters and reverse the entered string.
The program has two member functions:
pop()- to pop the elements out of the stack.
push()- to push the elements into the stack.
 */

package DSA.stack;
import java.util.*;
 class Node {
    char data;
    Node next;
    Node(char data){
        this.data=data;
        next=null;
}
}
public class reversestrstack {

    static Node top=null;
    public static void push(char data)
    {
        Node newNode=new Node(data);
        if(top==null)
        {

            top=newNode;
        }
        else
        {
            newNode.next=top;
            top=newNode;
        }
    }
    public static char pop()
    {
        char ans='0';
        if(top==null) {
            System.out.println("Stack empty");

        }
        else
            {
                ans=top.data;
                top=top.next;
            }
            return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.next();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            push(s.charAt(i));
        }
        String str="";
        for(int i=0;i<l;i++)
            str=str+pop();

        System.out.println("Reverse of the string = "+str);
    }
}
