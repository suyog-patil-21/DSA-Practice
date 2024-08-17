package DSABootcampJava.searching06.medium;

public class Q2 {
    // ? https://leetcode.com/problems/single-element-in-a-sorted-array
    public static void main(String[] args) {
        // int[] nums = new int[] { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        // int[] nums = new int[] { 3, 3, 7, 7, 10, 11, 11 };
        // int[] nums = new int[] { 1,3, 3, 7, 7, 10, 10, 11, 11 };
        // int[] nums = new int[] { 3, 3, 7, 7, 10, 10, 11, 11,12 };
        // int[] nums = new int[] { 3, 3 };
        // int[] nums = new int[] { 3, 2 };
        // int[] nums = new int[] { 2 };
        // int[] nums = new int[] { 1, 2, 2, 3, 3 };
        int[] nums = new int[] { 2, 2, 3, 3, 4 };

        System.out.println("Output Method 1: " + singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int start = 0;
        int end = nums.length - 1;
        while (start != end) {
            int mid = start + (end - start) / 2;
            if (mid < nums.length && nums[mid] == nums[mid + 1]) {
                if (mid % 2 == 0) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else if (mid > 0 && nums[mid] == nums[mid - 1]) {
                if (mid % 2 == 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                return nums[mid];
            }
        }
        return nums[start];
    }
}
