package DSABootcampJava.searching06.easy;

public class Q17 {
    // ? https://leetcode.com/problems/binary-search
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 11, 12, 13, 212 };
        int target = 12;
        System.out.println("Output Method 1" + search(arr, target));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
