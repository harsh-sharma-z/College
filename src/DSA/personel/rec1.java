/*
This following programs uses a recursive function to calculate the factorial of a given number.
 */

package DSA.personel;

public class rec1 {

    public static int fact(int n)
    {
        int fac=1;
        if(n==1)
            return 1;
        else
            fac=n*fact(n-1);

        return fac;

    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
