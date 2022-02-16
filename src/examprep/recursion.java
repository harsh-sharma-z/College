package examprep;

import java.util.Scanner;

public class recursion {
    static int factorial = 1;
    public static int fact(int n) {
        if (n > 0) {

            factorial *= n;
            n--;
            fact(n);

        }return (factorial);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number to find its factorial:");
        n=sc.nextInt();
        System.out.println("The factorial is="+fact(n));

    }
}
