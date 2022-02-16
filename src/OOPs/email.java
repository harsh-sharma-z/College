package OOPs;

import java.util.*;
public class email {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter OOPs.email:");
        String a=sc.next();
        int l=a.length();
        if(a.indexOf(".in",a.indexOf('@'))==l-3)
            System.out.println("It is an Indian OOPs.email.");
        else
            System.out.println("Not an Indian OOPs.email.");
        if(a.indexOf(".ac",a.indexOf('@'))==l-6)
            System.out.println("It is a academic OOPs.email.");
        else
            System.out.println("Not an academic OOPs.email.");

    }
}
