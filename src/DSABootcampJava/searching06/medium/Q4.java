package DSABootcampJava.searching06.medium;

public class Q4 {
    // ? https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
    public static void main(String[] args) {
        // int[] nums = new int[] { 2, 5, 6, 0, 0, 1, 2 };
        // int[] nums = new int[] { 1 };
        // int[] nums = new int[] { 1, 0, 1, 1, 1 };
        int[] nums = new int[] { 3 ,5 ,1};
        // int target = 0;
        int target = 3;
        System.out.println("Output :" + search(nums, target));
    }

    public static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            int number = binarySearch(0, nums.length - 1, nums, target);
            if (number == -1) {
                return false;
            }
            return true;
        }
        if (nums[pivot] == target) {
            return true;
        } else if (target >= nums[0]) {
            int number = binarySearch(0, pivot, nums, target);
            if (number == -1) {
                return false;
            }
            return true;

        } else {
            int number = binarySearch(pivot , nums.length - 1, nums, target);
            if (number == -1) {
                return false;
            }
            return true;

        }
    }

    public static int binarySearch(int start, int end, int[] arr, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
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
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (start < end && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
