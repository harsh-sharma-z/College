package OOPs;
import java.util.*;
class A
{
    int x;
    int y;
    A(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    A()
    {
        //agar bina parameters ka object banana pada tb k liye
    }
}
public class practice4  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A obj=new A(10,20);
        A arr[]=new A[5]; //iske elements reference store karenge bs abhi k liye
        System.out.println("Enter values of x and y for 5 objects:");
        for(int i=0;i<5;i++)
        {
            arr[i]=new A(sc.nextInt(),sc.nextInt());
        }

    }
}
