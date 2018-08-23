package com.company;

import java.util.Arrays;

public class InsertionSort {
    private static void sort(int[] a) {
        final int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i ; j > 0 && (a[j] < a[j-1]); j--) {
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{5, 4, 3, 2, 1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
