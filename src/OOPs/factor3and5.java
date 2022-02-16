/*Input user-defined array and print the elements with are either factor of 3 or 5.
The number that are factors of both are not to be printed.
 */
package OOPs;
import java.util.*;
public class factor3and5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n,c;
        System.out.println("Enter number of elements in the array:");
        n=sc.nextInt();
        System.out.println("Enter the elements in array:");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("The elements which are factors of either 3 or 5 only are:\n");
        for(int i=0;i<n;i++)
        {
            c=0;
            if(arr[i]%3==0)
                c++;
            if(arr[i]%5==0)
                c++;

            if(c==1)
                System.out.print(arr[i]+" ");
        }
    }

}
