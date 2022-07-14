package com.company.array;
import java.io.*;
import java.util.*;

public class MajorityElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> majorityCandidate = majorityElement2(arr);
        System.out.println("Majority Candidate: " + majorityCandidate);
    }

    public static List<Integer> majorityElement2(int[] arr) {
        List<Integer> res = new ArrayList<>();
        // there can be a three possibility if majority element can occur greater than n/3 times.
        // 0 majority element present
        // 1 majority element present
        // 2 majority element present

        int candidate1 = -1;
        int count1 = 0;
        int candidate2 = -1;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == candidate1) {
                count1++;
            } else if(arr[i] == candidate2) {
                count2++;
            } else if(count1 == 0) {
                candidate1 = arr[i];
                count1++;
            } else if(count2 == 0) {
                candidate2 = arr[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == candidate1) {
                count1++;
            } else if(arr[i] == candidate2) {
                count2++;
            }
        }

        if(count1 > arr.length/3) {
            res.add(candidate1);
        }
        if(count2 > arr.length/3) {
            res.add(candidate2);
        }
        return res;
    }

}
