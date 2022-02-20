package Algorithms.Sort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        // * Array  must contain a Range from 1 to N for this sorting Method
        int[] arr = new int[] { 1, 5, 4, 3, 6, 2 };
        System.out.println("Cyclic Sort : " + Arrays.toString(cyclicSort(arr)));
    }

    /**
     * Cyclic Sort
     * Duplicate numbers not allowed
     * Time Complexity Worst Case O(N), Best Case O(N)
     * 
     * @param arr
     * @return
     */
    public static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }else{
                i++;
            }

        }
        return arr;
    }

    public static void swap(int[] arr, int firstElement, int secondElement) {
        int temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = temp;
    }
}
