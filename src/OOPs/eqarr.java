package OOPs;

import java.util.*;

public class eqarr {

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);

        int n1,n2;
        System.out.println("Enter number of elements in first array:");
                n1=sc.nextInt();
        System.out.println("Enter number of elements in the second array:");
        n2=sc.nextInt();

        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        System.out.println("Enter elements in first array:");
        for(int i=0;i<n1;i++)
            arr1[i]=sc.nextInt();
        System.out.println("Enter element in second array");
        for(int i=0;i<n2;i++)
            arr2[i]=sc.nextInt();

        if(n1!=n2)
            System.out.println("Arrays are not equal");
        else
        {
            int c=0;
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for (int i = 0; i < n1; i++)
                if (arr1[i] != arr2[i])
                    c=c+1;


            if(c==0)
                System.out.println("Arrays are equal");
            else
                System.out.println("Arrays are not equal");

        }



    }
}
