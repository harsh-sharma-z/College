package OOPs;

import java.util.*;

class Student1
{


    String Name;
    int h;
    int w;

}

public class maxhandl
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);

        Student1 []s=new Student1[5];

        for(int i=0;i<5;i++)
        {
            System.out.println("Enter name , height and weight of "+(i+1)+"th student:");
            s[i]=new Student1();

            s[i].Name=sc.next();
            s[i].h=sc.nextInt();
            s[i].w=sc.nextInt();


        }

        int maxh=s[0].h;
        int maxhi=0;
        int maxw=s[0].w;
        int maxwi=0;
        for(int i=0;i<5;i++)
        {



            if(maxh<s[i].h)
            {
                maxh=s[i].h;
                maxhi=i;
            }
            if(maxw<s[i].w)
            {
                maxw=s[i].w;
                maxwi=i;
            }

        }


        System.out.println("Student with maximum height:"+s[maxhi].Name);
        System.out.println("student with maximum weigth:"+s[maxwi].Name);



    }
}