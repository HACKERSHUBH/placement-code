package com.company.array;
import java.io.*;
import java.util.*;

/*
  Naive Solution - We can run three loops for i,j,k and find out a[i], a[j], a[k] whose sum is equal to the target sum. and store elements in set.
  Better - We can use hashing, run loop for i and j, and store all the elements in hashmap then check sum - (a[i] + a[j]) is present in hashmap or not, if found we can store the elements in hashset.
  Optimal - 2 pointer approach
*/
public class TargetSumTriplet {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
      int givenSum = sc.nextInt();
      threeSumAlternative(arr, givenSum);
    }

    public static List<List<Integer>> twoSum(int[] arr, int si, int ei, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int left = si;
        int right = ei;

        while(left < right) {
            if(left != si && arr[left] == arr[left - 1]) {
                left++;
                continue;
            }

            int sum = arr[left] + arr[right];
            if(sum == target) {
                List<Integer> subRes = new ArrayList<>();
                subRes.add(arr[left]);
                subRes.add(arr[right]);
                res.add(subRes);
                left++;
                right--;
            } else if(sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return res;
    }

    public static List<List<Integer>> threeSum(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;
        if(n < 3) return res;

        Arrays.sort(arr);

        for (int i = 0; i <= n - 3; i++) {
            if(i!=0 && arr[i] == arr[i-1]) {
                continue;
            }

            int val1 = arr[i];
            int targ = target - arr[i];
            List<List<Integer>> subRes = twoSum(arr, i+1, n-1, targ);
            for (List<Integer> list: subRes){
                list.add(val1);
                res.add(list);
            }
        }
        return res;
    }

    public static int threeSumAlternative(int[] arr, int sum) {
        int n = arr.length - 1;
        Arrays.sort(arr);
        for (int i = 0; i < n-2; i++) {
            int li = i+1;
            int ri = n-1;
            while(li < ri) {
                int tripletSum = arr[i] + arr[li] + arr[ri];
                if(tripletSum == sum) {
                    System.out.println("Triplet present in the array are: " + arr[i] + " " + arr[li]+ " "+ arr[ri]);
                    return 1;
                }
                if(tripletSum < sum) {
                    li++;
                } else {
                    ri--;
                }
            }
        }
        return 0;
    }
}
