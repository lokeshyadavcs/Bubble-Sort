package com.company;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    Scanner sc=new Scanner(System.in);
    Random rand = new Random();
    int b;
    BubbleSort obj=new BubbleSort();


    public void intarray2() {
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(100);
        }
        obj.bubbleSort(a,n);


    }

    public void chararray2() {
        int n=7;
        char[] a = new char[n];


        for (int i = 0; i < n; i++) {
            b = rand.nextInt(100);
            a[i] = (char) b;
        }
        obj.bubbleSort(a,n);


    }

    public void longarray2() {
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();

        long[] a = new long[n];


        for (int i = 0; i < n; i++) {
            a[i] = rand.nextLong();
        }

        obj.bubbleSort(a,n);
    }

    public void booleanarray() {
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();

        boolean[] a = new boolean[n];


        for (int i = 0; i < n; i++) {
            a[i] = rand.nextBoolean();
        }
        obj.bubbleSort(a,n);

    }

    public void stringarray() {
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();

        String[] a = new String[n];
        String str="";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < rand.nextInt(15); j++) {
                b = rand.nextInt(500);
                str =str + (char) b;
            }a[i]=str;
        }
        obj.bubbleSort(a,n);


    }


}
