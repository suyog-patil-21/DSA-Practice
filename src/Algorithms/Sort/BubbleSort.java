package Algorithms.Sort;

import java.util.Arrays;

class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 2, 3, 223, 2, 11, 3, 23 };
        System.out.println("Bubble Sort : " + Arrays.toString(bubbleSort(arr)));
    }

    /**
     * Bubble Sort
     * Stable Sorting algorithm
     * Time Complexity Worst Case O(N^2), Best Case O(N)
     * 
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {
        boolean swap;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1 - i; j++) {
                swap = false;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
                if (!swap) {
                    break;
                }
            }

        }
        return arr;
    }
}