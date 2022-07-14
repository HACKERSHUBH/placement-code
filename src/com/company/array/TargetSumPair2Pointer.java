package com.company.array;
import java.io.*;
import java.util.*;

public class TargetSumPair2Pointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int givenSum = sc.nextInt();
        targetSumPair(arr, givenSum);
    }

    public static void targetSumPair(int arr[], int sum) {
        Arrays.sort(arr); // for sorting the array
        int li = 0;
        int ri = arr.length - 1;
        while (li < ri) {
            if(arr[li] + arr[ri] > sum){
                ri--;
            }
            else if(arr[li] + arr[ri] < sum) {
                li++;
            }
            else {
                System.out.println(arr[li] + " " + arr[ri]);
                li++;
                ri--;
            }
        }

    }
}
