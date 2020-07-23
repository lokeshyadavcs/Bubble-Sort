package com.company;

import java.util.Scanner;

public class BubbleSort {
    Scanner sc = new Scanner(System.in);
    RandomArray obj2=new RandomArray();
    public void typesofArray() {
        System.out.println("Please enter the choice of Sorting");
        System.out.println("Press 1 for Integer type Sorting");
        System.out.println("Press 2 for Character type Sorting");
        System.out.println("Press 3 for long type Sorting");
        System.out.println("Press 4 for boolean type Sorting");
        System.out.println("Press 5 for String type Sorting");
        System.out.println("Press 6 to exit");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Integer Sorting");

                intarray();
                break;
            case 2:
                System.out.println("Character Sorting");
                chararray();
                break;
            case 3:
                System.out.println("long Sorting");
                longarray();
                break;
            case 4:
                System.out.println("boolean Sorting");
                booleanarray();
                break;
            case 5:
                System.out.println("String Sorting");
                stringarray();
                break;
            default:
                System.out.println(" exiting...");
                break;

        }
    }

    public void intarray() {
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Do you want to input yourself or to generate it randomly ,press 1 for user input and 2 for random generate");
        int choice=sc.nextInt();
        if (choice==1){

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            bubbleSort(a, n);

        }
        else{
            obj2.intarray2(a,n);
        }




    }

    public void chararray() {
        System.out.println("Do you want to input yourself or to generate it randomly ,press 1 for user input and 2 for random generate");
        int choice=sc.nextInt();
        if (choice==1) {
            System.out.println("Please input the array without space or commas or other things");
            String str = sc.next();
            char[] acc = str.toCharArray();
            int n = acc.length;
            bubbleSort(acc, n);
        }
        else{
            obj2.chararray2();
        }

    }

    public void longarray() {
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();

        long[] a = new long[n];
        System.out.println("Do you want to input yourself or to generate it randomly ,press 1 for user input and 2 for random generate");
        int choice=sc.nextInt();
        if (choice==1) {
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            bubbleSort(a, n);
        }else{
            obj2.longarray2(a,n);
        }
    }

    public void booleanarray() {
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();

        boolean[] a = new boolean[n];
        System.out.println("Do you want to input yourself or to generate it randomly ,press 1 for user input and 2 for random generate");
        int choice=sc.nextInt();
        if (choice==1) {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextBoolean();
        }
        bubbleSort(a, n);

    }else{
            obj2.booleanarray(a,n);
        }
    }

    public void stringarray() {
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();

        String[] a = new String[n];
        System.out.println("Do you want to input yourself or to generate it randomly ,press 1 for user input and 2 for random generate");
        int choice=sc.nextInt();
        if (choice==1) {
            for (int i = 0; i < n; i++) {
                a[i] = sc.next();
            }
            bubbleSort(a, n);
        }else {
            obj2.stringarray(a,n);
        }

    }

    public void bubbleSort(int[] a, int n) {
        int i, j, temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }

    public void bubbleSort(long[] a, int n) {
        int i, j;
        long temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0 ; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }


    }

    public void bubbleSort(char[] a, int n) {
        int i, j;
        char temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0 ; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }


    }

    public void bubbleSort(boolean[] a, int n) {
        int i, j;
        boolean temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }


    }

    public void bubbleSort(String[] a, int n) {
        int i, j;
        String temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }


    }


}
