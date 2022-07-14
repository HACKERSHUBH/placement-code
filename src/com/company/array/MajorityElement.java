package com.company.array;
import java.io.*;
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int potentialMajorityCandidate = majorityElement(arr);
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == potentialMajorityCandidate) {
                cnt++;
            }
        }
        if(cnt > arr.length/2) {
            System.out.println("Majority Element is: " + potentialMajorityCandidate);
        } else {
            System.out.println("No Majority Element Exist");
        }
    }

    public static int majorityCandidate(int[] arr) {
      int val = arr[0];
      int count = 1;

      for (int i = 1; i < arr.length; i++) {
          if(arr[i] == val) {
              count++;
          } else {
              count--;
          }
          if(count == 0) {
              val = arr[i];
              count = 1;
          }
      }
      return val;
    }

    public static int majorityElement(int[] arr) {
        int count = 0;
        int candidate = -1; // it can be initialized with 0 as well.

        for (int i = 0; i < arr.length; i++) {
            if(count == 0) {
                candidate = arr[i];
            }

            if(candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
