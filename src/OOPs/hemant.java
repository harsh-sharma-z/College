package OOPs;
import java.util.*;
public class hemant {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String str;
        str=sc.next();
        int a[]=new int[3];
        a[0]=1;
        a[1]=0;
        a[2]=0;

        int temp;
        for(int i=0;i<str.length();i++) {

            if (str.charAt(i) == 'A') {
                temp = a[0];
                a[0] = a[1];
                a[1] = temp;

            } else if (str.charAt(i) == 'B') {
                temp = a[1];
                a[1] = a[2];
                a[2] = temp;

            } else {
                temp = a[2];
                a[0] = a[2];
                a[2] = temp;

            }
        }
        int ans=1;
        for(int i=0;i<3;i++)
        {
            if(a[i]==1) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);

    }

}
