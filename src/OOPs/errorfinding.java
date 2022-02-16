package OOPs;

public class errorfinding {
    public static void main(String args[])
    {
        int s=0;
        for(String a:args)
        {
            int st=0;

            try {
                 st = Integer.parseInt(a);
            }
            catch(NumberFormatException e){
            System.out.println(a+" is not an integer.");
        }
            s=s+st;
        }
        System.out.println("Sum="+s);

    }
}
