package endterm;

import java.util.*;

class mycal
{
    long pow(int n,int p) throws Exception
    {
        if(n<0||p<0)
            throw new Exception("n or p is not negative");
        else if(n==0&&p==0)
            throw new Exception("n or p is not zero");

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