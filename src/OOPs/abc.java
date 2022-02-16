package OOPs;

import java.util.*;
public class abc {
    public int sum(int...a)
    {
        int sum=0;
        for(int i:a)
        {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
                int a,b,c,d;
        System.out.println("Enter 4 no.s:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        abc ans=new abc();
        System.out.println("Sum="+ans.sum(a,b));
        System.out.println("Sum="+ans.sum(a,b,c));

        System.out.println("Sum="+ans.sum(a,b,c,d));
    }
}
