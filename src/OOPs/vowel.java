package OOPs;

import java.util.*;
public class vowel {
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        String s;
        System.out.println("Enter a string:");
        s=sc.nextLine();
        String str=s.toUpperCase();
        int vow=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
                vow++;
        }
        System.out.println("Number of vowels="+vow);
    }
}
