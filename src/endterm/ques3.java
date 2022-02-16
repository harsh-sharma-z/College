package endterm;

abstract class Marks
{
    public abstract float getPercentage();
}
class A extends Marks
{
    int m1,m2,m3;
    A(int m1,int m2,int m3)
    {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    public float getPercentage()
    {
        return (float) (((m1+m2+m3)/300.0)*100.0);
    }
}

class B extends Marks
{
    int m1,m2,m3,m4;
    B(int m1,int m2,int m3,int m4)
    {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
    }
    public float getPercentage()
    {
        return (float) (((m1+m2+m3+m4)/400.0)*100.0);
    }
}

public class ques3 {
    public static void main(String[] args) {
        A a=new A(96,89,90);
        System.out.println("Percentage of A="+a.getPercentage());
        B b=new B(89,78,90,99);
        System.out.println(("Percentage of B="+b.getPercentage()));
    }
}
