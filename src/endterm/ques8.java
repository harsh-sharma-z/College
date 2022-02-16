package endterm;

public class ques8 {
    public static void main(String[] args) {

        even e=new even();
        Thread t1=new Thread(e);
        t1.start();

        odd o=new odd();
        Thread t2=new Thread(o);
        t2.start();

    }
}
class odd implements Runnable
{
    public void run ()
    {
        for(int i=1;i<=20;i+=2)
            System.out.println(i);

    }
}
class even implements Runnable
{
    public void run()
    {
        for(int i=0;i<=20;i+=2)
            System.out.println(i);
    }
}
