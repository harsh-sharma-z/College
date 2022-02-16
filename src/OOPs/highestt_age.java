package OOPs;

import java.util.*;

public class highestt_age {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age, roll. no., height of the " + (i + 1) + " student:");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        int maxh = arr[0][2];
        int maxhi = 0;

        for (int i = 0; i < 3; i++) {
            if (maxh < arr[i][2]) {
                maxh = arr[i][2];
                maxhi = i;
            }
        }

        System.out.println("The age, roll no. of the student with maximum height is:");
        System.out.println("AGE:" + arr[maxhi][0] + "\nRoll. no.:" + arr[maxhi][1]+"\nHeight:"+arr[maxhi][2]);

    }

}
