package com.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 6, 3, 8};

        quickSortMethod(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static int Partition(int[] arr, int low, int high) {
        int pivot = arr[low];

        int left = low + 1;
        int right = high;

        while (left <= right) {

            while (left <= high && arr[left] <= pivot) {
                left++;
            }

            while (right > low && arr[right] > pivot) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        
        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;

        return right;
    }

    public static void quickSortMethod(int[] arr, int low, int high) {

        if (low < high) {
            int pivot = Partition(arr, low, high);

            quickSortMethod(arr, low, pivot - 1);
            quickSortMethod(arr, pivot + 1, high);
        }
    }
}