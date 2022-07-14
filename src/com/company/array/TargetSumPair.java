package com.company.array;
import java.io.*;
import java.util.*;

public class TargetSumPair {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int givenSum = sc.nextInt();
        targetSumPair(arr, givenSum);
    }

    public static void targetSumPair(int arr[], int sum) {
        // we have to use hashing technique
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            if(hash.contains(temp)) {
                System.out.println("pair with given sum are: "+ arr[i] + " " + temp);
            }
            hash.add(arr[i]);
        }
    }
}
