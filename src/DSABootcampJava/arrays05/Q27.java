package DSABootcampJava.arrays05;

public class Q27 {
    // ? https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public static void main(String[] args) {
        int[] nums = { 1 };
        System.out.print("Output : " + removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int storeindex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[storeindex] != nums[i] && nums[storeindex] <= nums[i]) {
                nums[++storeindex] = nums[i];
            }
        }
        return storeindex + 1;
    }
}
