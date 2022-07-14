package com.company.linkedlist;

import java.util.Scanner;

public class LinearSearch {
    // create class for node
    public static class Node {
        int data;
        Node next;
    }
    // create class for linked list
    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void addNodeAtLast(int data) {
            Node temp = new Node();
            temp.data = data;
            temp.next = null;

            if(size == 0) {
                head = tail = temp;
            }else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }
   public static Boolean linearSearch(LinkedList list, int target) {
        Node head = list.head;
        if(head != null) {
            while (head != null) {
                if(head.data == target) {
                    return true;
                }
                head = head.next;
            }
        }
        return false;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.addNodeAtLast(val);
        }
        Boolean res = linearSearch(list, t);
        System.out.println(res);
    }
}
