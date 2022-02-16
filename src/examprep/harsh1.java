package examprep;

import java.util.*;

class Student
{

    int roll;
    String Name;
    int marks;

}

public class harsh1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);

        Student []s=new Student[3];

        for(int i=0;i<3;i++)
        {
            System.out.println("Enter roll, name and marks of "+(i+1)+"th student:");
            s[i]=new Student();
            s[i].roll=sc.nextInt();
            s[i].Name=sc.next();
            s[i].marks=sc.nextInt();

        }
        float avg=0;
        avg=(s[0].marks+s[1].marks+s[2].marks)/3;

        System.out.println("Average marks of the students="+avg);



    }
}