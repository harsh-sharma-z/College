package examprep;
import java.util.*;
public class allalpha {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        String s;
        s=sc.nextLine();

        String str=s.toLowerCase();
        int check=0;
        boolean alpha[]=new boolean[26];
        for(int i=0;i<str.length();i++)
        {
            if('a'<=str.charAt(i)&& str.charAt(i)<='z')
            {
                check=str.charAt(i)-'a';
            }
            alpha[check]=true;

        }

        for(int i=0;i<26;i++)
        {
            if(!alpha[i])
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }

}
