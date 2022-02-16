package endterm;
import java.util.Scanner;
class NegativeValueException extends Exception
{
    public NegativeValueException(String msg)
    {
        super(msg);
    }

}
class ZeroValueException extends Exception
{
    public ZeroValueException(String msg)
    {
        super(msg);
    }
}
public class ques5
{
    public static void calculatepower() throws NegativeValueException, ZeroValueException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base number:");
        int n=sc.nextInt();
        System.out.println("Enter power:");
        int p=sc.nextInt();
        if(p==0 || n==0)
            throw new ZeroValueException("Base number or power should not be zero!");
        else
        if(p<0 || n<0)
            throw new NegativeValueException("Base number or power should not be a negative number!");
        else
        {
            System.out.println("Answer is="+Math.pow(n,p));
        }


    }

    public static void main(String[] args) {
        try
        {
            calculatepower();
        }
        catch(NegativeValueException  e)
        {
            System.out.println(e);
        }
        catch(ZeroValueException e)
        {
            System.out.println(e);
        }
    }
}

