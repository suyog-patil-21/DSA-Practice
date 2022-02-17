package Algorithms.Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 223, 2, 11, 3, 23 };
        System.out.println("Insertion Sort : " + Arrays.toString(insertionSort(arr)));
    }

    /**
     * Insertion Sort
     * Stable Sorting algorithm
     * Time Complexity Worst Case O(N^2), Best Case O(N)
     * 
     * @param arr
     * @return
     */
    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int firstElementIndex, int secondElementIndex) {
        int temp = arr[firstElementIndex];
        arr[firstElementIndex] = arr[secondElementIndex];
        arr[secondElementIndex] = temp;
    }

}
