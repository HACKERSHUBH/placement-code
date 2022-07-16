package com.company.array;

import java.util.Scanner;

public class SeparateEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        separateEvenAndOdd0Numbers(arr);
    }

    public static void separateEvenAndOdd0Numbers(int[] arr) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if(arr[i]%2 != 0) {
                i++;
            } else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
        System.out.println(arr);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
