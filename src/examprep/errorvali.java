package examprep;
import java.util.*;
 class InvalidAge extends Exception
{
    public InvalidAge (String s)
    {
        super(s);

    }
}

public class errorvali {

    public static void testing () throws InvalidAge
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        if(age<18)
            throw new InvalidAge("Age less than 18");

        else
            System.out.println("Welcome to adulthood");


    }

    public static void main(String[] args) {
        try
        {
            testing();
        }
        catch(InvalidAge e)
        {
            System.out.println("Exception occured="+e);
        }
    }
}
