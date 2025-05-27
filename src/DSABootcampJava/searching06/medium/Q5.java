package DSABootcampJava.searching06.medium;

public class Q5 {
    // ? https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    public static void main(String[] args) {
        int[] nums = new int[] { 3, 4, 5, 1, 2 };
        System.out.println("Output : " + findMin(nums));
    }

    public static int findMin(int[] nums) {
        int count = findPivot(nums);
        return count == -1 ? nums[0] : count == nums.length-1 ? nums[0]: nums[count+1];
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
