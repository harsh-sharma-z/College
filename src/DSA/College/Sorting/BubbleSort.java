package DSA.College.Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }


        System.out.println("The sorteed array is :");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}
