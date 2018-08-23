package com.company;

import java.util.Arrays;

public class ShellSort {
    private static void sort(int[] a) {
        final int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && a[j] < a[j - h]; j -= h) {
                    int temp = a[j];
                    a[j] = a[j - h];
                    a[j - h] = temp;
                    System.out.println(Arrays.toString(a));

                }
            }
            h /= 3;
        }
    }

    private static void sortTest() {
        int[] a = new int[]{95, 86, 79, 63, 42, 34, 23, 20, 11, 8, 6, 4, 3, 1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        sortTest();
    }
}
