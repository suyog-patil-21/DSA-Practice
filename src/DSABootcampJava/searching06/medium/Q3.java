package DSABootcampJava.searching06.medium;

public class Q3 {
    // ? https://leetcode.com/problems/search-in-rotated-sorted-array/
    public static void main(String[] args) {
        int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        // int[] nums = new int[] { 0, 1, 6, 7, 8, 10 };
        // int[] nums = new int[] { 0 };
        int target = 0;
        System.out.println("Output Method 1:" + search(nums, target));
    }

    public static int search(int[] nums, int target) {
        final int pivot = findPivot(nums);
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if (target == nums[pivot]) {
            return pivot;
        } else if (target < nums[0]) {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
        return binarySearch(nums, target, 0, pivot - 1);
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < nums.length - 1 && nums[start] <= nums[mid] && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (nums[start] > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
