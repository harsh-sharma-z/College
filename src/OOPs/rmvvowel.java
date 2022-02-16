/*Take a string from the user and remove all the vowels from the same string and print it.
 */
package OOPs;
import java.util.*;
public class rmvvowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        str=str.replaceAll("[aeiou]","");
        System.out.println("The string with vowels removed is:\n"+str);

    }
}
