import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int num=n;
        int rev=0;
        while(n>0)
        {
            
            rev=(rev*10)+(n%10);
            n=n/10;
        }
        
        if(rev==num)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
