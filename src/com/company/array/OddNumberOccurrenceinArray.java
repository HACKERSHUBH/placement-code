package com.company.array;
import java.util.Scanner;

public class OddNumberOccurrenceinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int oddOccurrenceNumber = getOddOccurrenceNumber(arr);
        System.out.println(oddOccurrenceNumber);
    }

    public static int getOddOccurrenceNumber(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
}
