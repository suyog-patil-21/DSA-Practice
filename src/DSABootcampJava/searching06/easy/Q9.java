package DSABootcampJava.searching06.easy;

public class Q9 {
    // ? https://leetcode.com/problems/search-insert-position/
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int k = 0;
        System.out.print("Output : " + searchInsert(arr, k));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid])
                return mid;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (end < 0) {
            return 0;
        }
        return start;
    }
}
