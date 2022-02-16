package examprep;

 import java.util.regex.Matcher;
        import java.util.regex.Pattern;
public class regx {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[789]{1}[0-9]{9}");
        Matcher m = p.matcher("5979073515");
        int ctr=0;
        while(m.find())
        {
            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
            ctr++;
        }
        System.out.println(ctr);
    }
}
