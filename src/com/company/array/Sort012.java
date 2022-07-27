package com.company.array;

import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sort012(arr);
    }

    public static void sort012(int[] arr) {
        int size = arr.length;
        int i = 0,j=0;
        int k = size - 1;
        while (i <= k) {
            if(arr[i] == 1) {
                i++;
            } else if(arr[i] == 0) {
                swap(arr, i , j);
                i++;
                j++;
            } else {
                swap(arr, i, k);
                k--;
            }
        }
        for (int l = 0; l < size; l++) {
            System.out.print(arr[l] + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
