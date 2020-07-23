package com.company;

import java.util.Random;

public class RandomArray {
    Random rand = new Random();
    int b;


    public void intarray2(int[] a, int n) {

        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(100);
        }
        bubbleSort(a,n);


    }

    public void chararray2() {
        int n=7;
        char[] a = new char[n];


        for (int i = 0; i < n; i++) {
            b = rand.nextInt(100);
            a[i] = (char) b;
        }
        bubbleSort(a,n);


    }

    public void longarray2(long[] a, int n) {


        for (int i = 0; i < n; i++) {
            a[i] = rand.nextLong();
        }

        bubbleSort(a,n);
    }

    public void booleanarray(boolean[] a, int n) {


        for (int i = 0; i < n; i++) {
            a[i] = rand.nextBoolean();
        }
        bubbleSort(a,n);

    }

    public void stringarray(String[] a, int n) {
        String str="";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < rand.nextInt(15); j++) {
                b = rand.nextInt(100);
                str =str + (char) b;
            }a[i]=str;
        }
        bubbleSort(a,n);


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
