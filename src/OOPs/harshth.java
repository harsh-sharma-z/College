package OOPs;

public class harshth implements Runnable{
    public void run() {
        for(int i=0;i<6;i++)
            System.out.println(i);
    }
    public static void main(String args[])
    {
        harshth t1=new harshth();
        Thread obj=new Thread(t1);obj.start();
        for(int i=0;i<3;i++)
        System.out.println("Thread ran succesfully");
    }
}
