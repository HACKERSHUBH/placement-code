package com.company.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
We can do this question by taking left pointer to 0 and right pointer to arr.length-1
1) Initialize two index variables left and right:
            left = 0,  right = size -1
2) Keep incrementing left index until we see an even number.
3) Keep decrementing right index until we see an odd number.
4) If left < right then swap arr[left] and arr[right]
*/

public class Separate0sand1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        separated0sAnd1s(arr);
    }

    public static void separated0sAnd1s(int[] arr) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if(arr[i] == 1) {
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

    public static void separated0sAnd1sAleternate (int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (arr[i] == 0 && i < j) {
                i++;
            }
            while (arr[j] == 1 && j > i) {
                j--;
            }
            if( i < j ){
                arr[i++] = 0;
                arr[j--] = 1;
            }
        }
        System.out.println(arr);
    }
}
