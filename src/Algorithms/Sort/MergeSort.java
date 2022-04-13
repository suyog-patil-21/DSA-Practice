package Algorithms.Sort;

import java.util.Arrays;

class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 6, 4, 63, 23, 63 };
        System.out.println("Method 1 : " + Arrays.toString(mergeSortNoInPlace(arr)));
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println("Method 2 (In-Place) : " + Arrays.toString(arr));
    }

    /**
     * Merger Sort
     * Not In-place Sorting algorithm
     * Time Complexity O(N * Log2N)
     * Space Complexity O(N);
     * 
     * @param arr
     * @return int arr
     */
    public static int[] mergeSortNoInPlace(int[] arr) {
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;
        int[] left = mergeSortNoInPlace(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSortNoInPlace(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] sortArray = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                sortArray[k++] = left[i++];
            } else {
                sortArray[k++] = right[j++];
            }
        }
        while (i < left.length) {
            sortArray[k++] = left[i++];
        }

        while (j < right.length) {
            sortArray[k++] = right[j++];
        }

        return sortArray;
    }

    public static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end - start == 1)
            return;
        int mid = start + (end - start) / 2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);
        merge2(arr, start, mid, end);
    }

    private static void merge2(int[] arr, int start, int mid, int end) {
        int i = start, j = mid, k = 0;
        int[] mix = new int[end - start];
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }
        while (i < mid) {
            mix[k++] = arr[i++];
        }

        while (j < end) {
            mix[k++] = arr[j++];
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }

}
