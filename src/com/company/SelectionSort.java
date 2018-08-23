package com.company;

import java.util.Arrays;

public class SelectionSort {
    private static void sort(int[] a) {
        final int N = a.length;
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (a[j] < a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 23, 4, 5, 3, 7, 86, 3, 6, 8};
        sort(a);
        System.out.println(Arrays.toString(a));

    }
}
