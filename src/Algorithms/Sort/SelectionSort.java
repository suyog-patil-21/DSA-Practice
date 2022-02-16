package Algorithms.Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3,-5, 5, 223, 2, 11, 3, 23 };
        System.out.println("Bubble Sort : " + Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;// correct possition index
            int maxElement = findMaxElement(arr, 0, last);// greatest element index
            swap(arr, last, maxElement); // swap
        }
        return arr;
    }

    static void swap(int[] arr, int firstElementIndex, int secondElementIndex) {
        int temp = arr[firstElementIndex];
        arr[firstElementIndex] = arr[secondElementIndex];
        arr[secondElementIndex] = temp;
    }

    private static int findMaxElement(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
