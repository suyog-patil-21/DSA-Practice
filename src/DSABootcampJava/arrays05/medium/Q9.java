package DSABootcampJava.arrays05.medium;

import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sortColorsMethod1(nums);
        // sortColorsMethod2(nums); // Any Sorting Algorithm
        System.out.println("Output :" + Arrays.toString(nums));
    }

    public static void sortColorsMethod1(int[] nums) {
        int arr[] = { 0, 0, 0 };
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                arr[0]++;
            else if (nums[i] == 1)
                arr[1]++;
            else if (nums[i] == 2)
                arr[2]++;
        }
        for (int i = 0; i < arr[0]; i++) {
            nums[i] = 0;
        }
        for (int i = 0; i < arr[1]; i++) {
            nums[i+arr[0]] = 1;
        }
        for (int i = 0; i < arr[2]; i++) {
            nums[i+arr[0]+arr[1]] = 2;
        }
    }

    public static void sortColorsMethod2(int[] nums) {
        insertionSort(nums);
    }

    private static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] <= nums[j - 1]) {
                    swap(j, j - 1, nums);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int firstIndex, int secondIndex, int[] nums) {
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }
}
