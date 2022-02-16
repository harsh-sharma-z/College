package OOPs;

import java.util.*;
public class sumofarray {

    public int sumarray(int []arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements:");
        n=sc.nextInt();
        int []a=new int[n];
        System.out.println("Enter "+n+" elements in the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        sumofarray ans=new sumofarray();
        int arrsum= ans.sumarray(a);
        System.out.println("Sum of elements of array:"+arrsum);

    }
}
