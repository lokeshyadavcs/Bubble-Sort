package com.company;

public class BubbleSort {
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
