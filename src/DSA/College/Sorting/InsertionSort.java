package DSA.College.Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }


        System.out.println("The sorted array is :");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}
