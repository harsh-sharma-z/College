/*
The following program contains a class myCalculator that implements an interface named AdvancedArithematic.
 */

package endterm;

import java.util.Scanner;

interface AdvancedArithematic {
    int divisum(int n);
}

class MyCalculator implements AdvancedArithematic
{
    public int divisum(int n)
    {
        int c=0;
        for(int i=1;i<=n/2;i++)
            if(n%i==0)
                c+=i;
            return c+n;

    }
}
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        MyCalculator a=new MyCalculator();
      int sum=  a.divisum(n);
        System.out.println("Sum="+sum);
    }
}
