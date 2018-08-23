package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    private static int[] aux;

    private static void sort(int[] a) {
        aux = new int[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void merge(int[] a, int lo, int mid, int hi) {
    }

    private static void sort(int[] a, int lo, int hi) {
        if (hi >= lo) {
            return;
        }
        int mid = lo + (hi / 2);
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
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
