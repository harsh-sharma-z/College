import java.io.*;
import java.util.*;

public class StackOp {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        Stack<Character> st=new Stack<>();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
            st.push(ch[i]);
        int c=0,r=0,s=0;
        for(int i=0;i<ch.length;i++)
        {
            if(st.pop()=='{')
                c++;
            else if(st.pop()=='}')
                c--;
            else if(st.pop()=='(')
                r++;
            else if(st.pop()==')')
                r--;
            else if(st.pop()=='[')
                s++;
            else
                s--;
        }

        if(s==0 && r==0 && c==0)
            System.out.println("Balanced");
        else
            System.out.println("Invalid");

    }
}