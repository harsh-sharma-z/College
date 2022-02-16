package OOPs;

import java.util.*;
class replace
{
    void rep(int []arr,int id,int nm)
    {
        arr[id]=nm;
    }
}
public class replace_fun {


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements in the array:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements in the array:");
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.println("Index at which you want to lab.replace the number:");
        int index=sc.nextInt();
        System.out.println("Number which you want to add the the mentioned index:");
        int num=sc.nextInt();
        replace ans=new replace();
        ans.rep(a,index,num);
        System.out.println("Array after performing the operation is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }


    }
}
