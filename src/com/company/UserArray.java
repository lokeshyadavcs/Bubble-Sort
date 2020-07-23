package com.company;

import java.util.Scanner;

public class UserArray {
    Scanner sc = new Scanner(System.in);
    BubbleSort obj1 = new BubbleSort();

    public void intarray() {
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();
        int[] a = new int[n];


        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        obj1.bubbleSort(a, n);

    }


    public void chararray() {

            System.out.println("Please input the array without space or commas or other things");
            String str = sc.next();
            char[] acc = str.toCharArray();
            int n = acc.length;
            obj1.bubbleSort(acc, n);


    }

    public void longarray() {
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();

        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        obj1.bubbleSort(a, n);

    }

    public void booleanarray() {
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();

        boolean[] a = new boolean[n];


        for (int i = 0; i < n; i++) {
            a[i] = sc.nextBoolean();
        }
        obj1.bubbleSort(a, n);


    }

    public void stringarray() {
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();

        String[] a = new String[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.next();
            }
            obj1.bubbleSort(a, n);

    }


}
