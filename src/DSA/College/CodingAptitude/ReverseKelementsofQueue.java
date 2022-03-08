/*
This program take two inetegers n and k.
Stores n elements in a queue.
And reverse the first k elements of a k sized queue.
 */

package DSA.College.CodingAptitude;
import java.util.*;
public class ReverseKelementsofQueue {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Queue<Character> harsh=new LinkedList<Character>();
        int[] count = new int[26];



        for(int i=0;i<s.length();i++)
        {
            harsh.add(s.charAt(i));
            count[s.charAt(i)-'a']++;

            while(!harsh.isEmpty())
            {
                if(count[harsh.peek()-'a']>1)
                    harsh.remove();
                else
                {
                    System.out.print(harsh.peek()+" ");
                    break;
                }

            }
            if(harsh.isEmpty())
                System.out.print(-1+" ");
        }
        System.out.println();

    }
}
