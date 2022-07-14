package com.company.array;
import java.io.*;
import java.util.*;

public class DistinctTargetSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int givenSum = sc.nextInt();
        distinctTargetSumPair(arr, givenSum);
        // Efficient approach of this solution would be hashing. Refer geeksforgeeks while revising question.
    }

    public static void distinctTargetSumPair(int[] arr, int sum) {
        Arrays.sort(arr);
        int li = 0;
        int ri = arr.length - 1;

        while (li < ri) {
            if(li!=0 && arr[li] == arr[li-1]) {
                li++;
                continue;
            }
            int temp = arr[li] + arr[ri];
            if(temp > sum) {
                ri--;
            } else if(temp < sum) {
                li++;
            } else {
                System.out.println(arr[li] + " " + arr[ri]);
                li++;
                ri--;
            }
        }
    }
}
