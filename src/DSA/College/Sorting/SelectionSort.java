package DSA.College.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter length of the array:");
        int a[] = new int[n];
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }
}