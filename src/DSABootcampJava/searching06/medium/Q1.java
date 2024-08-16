package DSABootcampJava.searching06.medium;

import java.util.Arrays;

public class Q1 {
    // ?
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public static void main(String[] args) {
        // int[] nums = { 5, 7, 7, 8, 8, 10 };
        int[] nums = { 5, 8, 8, 8, 8, 10, 23, 34 };
        int target = 8;
        System.out.println("Output Method 1" + Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = search(nums, 0, nums.length - 1, target, true);
        result[1] = search(nums, 0, nums.length - 1, target, false);
        return result;
    }

    public static int search(int[] nums, int start, int end, int target, boolean isLeft) {
        boolean flag = false;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                flag = true;
                if (isLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        if (flag == true) {
            if (isLeft && start >= 0 && nums[start] == target) {
                return start;
            }
            if (!isLeft && end < nums.length && nums[end] == target) {
                return end;
            }
        }
        return -1;
    }
}
