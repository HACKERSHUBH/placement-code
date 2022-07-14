package com.company.array;
import java.io.*;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = recursiveBinarySearch(arr, 0 , arr.length -1, val);
        System.out.println(result);
    }

    public static int iterativeBinarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) >> 1;
            if(arr[mid] == target) {
                return mid;
            }
            if(target >arr[mid]) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int left, int right, int target) {
        if(right >= left && left <= arr.length -1) {
            int mid = (left + right) >> 1;
            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] > target) {
                return recursiveBinarySearch(arr, left, mid-1, target);
            }
            else {
                return recursiveBinarySearch(arr, mid+1 , right, target);
            }
        }
        return -1;
    }
}
