package com.company.array;

import java.util.Scanner;

public class EquilibriumIndexInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int equilibriumIndex = getEquilibriumIndex(arr);
        System.out.println(equilibriumIndex);
    }

    public static int getEquilibriumIndex(int[] arr) {
        int size = arr.length;
        int sum = countSum(arr);
        int leftSum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum - arr[i];
            if(leftSum == sum) {
                return i;
            }
            leftSum = leftSum + arr[i];
        }
        return 0;
    }

    public static int countSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
