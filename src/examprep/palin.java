package examprep;
import java.util.*;
public class palin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        int num=n,rev=0;
        while(n>0)
        {
            rev=(rev*10)+(n%10);
            n/=10;
        }
        if(num==rev)
            System.out.println("The entered number is palindrome.");
        else
            System.out.println("The number is not palindrome.");
    }
}
