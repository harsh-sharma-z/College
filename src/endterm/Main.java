/*
The following program has member function to calculate the power of a given number entered by the user.
It also implements exception handling to check if the number is zero or negative.
 */

package endterm;

import java.util.*;

class mycal
{
    long pow(int n,int p) throws Exception
    {
        if(n<0||p<0)
            throw new Exception("n or p is negative");
        else if(n==0&&p==0)
            throw new Exception("n or p is zero");

        return(int)Math.pow((double)n,(double)p);
    }

}
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt())
        {
            int n= sc.nextInt();
            int p= sc.nextInt();
            mycal m= new mycal();
            try {
                System.out.println(m.pow(n,p));

            } catch(Exception e)
            {
                System.out.println(e);
            }

        }

    }
}