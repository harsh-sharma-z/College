package OOPs;

import java.util.*;
public class samestr {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String a=sc.next();
        System.out.println("Enter second string:");
        String b=sc.next();

        if(a.equals(b))
            System.out.println("Strings are same");
        else
            System.out.println("Strings are not same");

    }
}
