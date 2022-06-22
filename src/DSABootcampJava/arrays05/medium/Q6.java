package DSABootcampJava.arrays05.medium;

import java.util.Arrays;

public class Q6 {
    // ?
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        System.out.println("Output : "+Arrays.toString(searchRange(arr, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[] { -1, -1 };
        if (nums.length == 0)
            return new int[] { -1, -1 };
        result[0] = binarySearch(nums, target, true);
        if (result[0] != -1)
            result[1] = binarySearch(nums, target, false);
        return result;
    }

    public static int binarySearch(int[] arr, int target, boolean isStartingIndex) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                result = mid;
                if (isStartingIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return result;
    }
}
