package OOPs;

import java.util.*;
public class sameintarr {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter length of the first array:");
        m=sc.nextInt();
        System.out.println("Enter length of the second array:");
        n=sc.nextInt();
        int []a=new int[m];
        int []b=new int[n];
        System.out.println("Enter first array:");
        for(int i=0;i<m;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter second array:");
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
        int c=0;
        if(m==n)
        {
            for(int i=0;i<m;i++)
            {
                if(a[i]!=b[i])
                {
                    c++;
                    break;
                }
            }
            if(c==0)
                System.out.println("Both the arrays are same.");
            else
                System.out.println("The arrays are not same");
        }
        else
            System.out.println("arrays are not same.");

    }
}
