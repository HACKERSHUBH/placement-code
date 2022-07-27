package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class ElementsSumClosestToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        getPairsSumClosestToZero(arr);
    }

    public static void getPairsSumClosestToZero(int[] arr) {
        int size = arr.length;
        int li = 0;
        int ri = size - 1;
        int curr_sum;
        int closest_sum = Integer.MAX_VALUE;
        int min_li = 0;
        int min_ri = size - 1;
        Arrays.sort(arr);
        while (li < ri) {
            curr_sum = arr[li] + arr[ri];
            if(Math.abs(curr_sum) < Math.abs(closest_sum)) {
                closest_sum = curr_sum;
                min_li = li;
                min_ri = ri;
            }
            if(curr_sum < 0) {
                li++;
            } else {
                ri--;
            }
        }
        System.out.println("Pair that will be closest to 0 will be: " + arr[min_li] + " and " + arr[min_ri]);
    }
}
