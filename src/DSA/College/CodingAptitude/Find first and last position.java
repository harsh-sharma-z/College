import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int num=sc.nextInt();
        int f=-1,l=-1;
        for(int i=0;i<=n/2;i++)
        {
            if(a[i]==num)
                f=i;
            if(a[n-i-1]==num)
                l=n-i;
}
        
        System.out.println(f+" "+l);
    }
}
