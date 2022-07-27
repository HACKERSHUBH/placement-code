package com.company.array;

import java.util.Scanner;

/*
Problem Statement - Find maximum difference between two elements in a array such that larger element appears after the smaller number.

Approach -1
 1). Calculate difference array from the given array.
 2). Find maximum sum subarray in the difference array.

    diff[i] = a[i+1] - a[i]
  How to find maximum sum subarray in any given array of elements.
  A). current_diff = diff[0]
  B). for all a[i] i=1 to n-1;
         check diff[i-1] > 0
              update diff[i]= diff[i] + diff[i-1]
         current_diff = maximum(current_diff, diff[i])
  return current_diff

  https://leetcode.com/problems/maximum-difference-between-increasing-elements/
  This is same problem as Stock Buy and Sell Problem in Striver sheet
*/
public class MaxDifferenceBetween2Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxDiff = getMaxDifference(arr);
        System.out.println(maxDiff);
    }

    public static int getMaxDifference(int[] arr) {
        int min_elem_so_far = Integer.MAX_VALUE;
        int max_diff_so_far = 0;
        int curr_diff;

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] < min_elem_so_far) {
                min_elem_so_far = arr[i];
            } else {
                curr_diff = arr[i] - min_elem_so_far;
                if(curr_diff > max_diff_so_far) {
                    max_diff_so_far = curr_diff;
                }
            }
        }
        return max_diff_so_far;
    }
}
