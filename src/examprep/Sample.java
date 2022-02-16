package examprep;

public class Sample {
    static int a=5;
     static int b=10;
    private static int c=22;
    static class xyz
    {
        void dis()
        {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Sample.xyz obj=new Sample.xyz();
        obj.dis();
    }
}