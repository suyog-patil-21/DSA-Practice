package ExtraQuestions;

import java.util.Arrays;

public class leetCode34 {
    
    // ? https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        System.out.println("Output : " + Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };
        // start index
        result[0] = search(nums, target, true);
        // end index
        result[1] = search(nums, target, false);
        return result;
    }

    static int search(int nums[], int target, boolean isSearchingStartValue) {
        int result = -1;
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {

                result = mid;
                if (isSearchingStartValue) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return result;
    }
}
