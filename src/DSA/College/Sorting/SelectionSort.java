package DSA.College.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }


        System.out.println("The sorted array is :");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);

    }
}