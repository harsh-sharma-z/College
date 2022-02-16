package endterm;
class Arithematic
{
    int add(int...a)
    {
        int sum=0;
        for (int i:a)
            sum+=i;
        return sum;
    }
}

public class ques6 extends Arithematic
{
    public static void main(String[] args) {
        Arithematic a=new Arithematic();
        System.out.println("My superclass is:"+a.getClass());
        System.out.println(a.add(1,2,3,4,5,6,7,8));
    }
}
