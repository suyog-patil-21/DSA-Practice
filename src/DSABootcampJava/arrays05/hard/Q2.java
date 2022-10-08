package DSABootcampJava.arrays05.hard;

public class Q2 {
    // ? https://leetcode.com/problems/first-missing-positive/
    public static void main(String[] args) {
        // int[] nums = { 1, 2, 0 };
        int[] nums = {3,4,-1,1};
        // int[] nums = { 7, 8, 9, 11, 12 };
        // System.out.println("Output : " + firstMissingPositiveMethod1(nums));
        System.out.println("Output : " + firstMissingPositiveMethod2(nums));
    }

    // for bigger number high time and space complexity error : [memory limit
    // execeded]
    public static int firstMissingPositiveMethod1(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        boolean[] checkValues = new boolean[max];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                checkValues[nums[i] - 1] = true;
            }
        }
        int i = 0;
        for (i = 0; i < checkValues.length; i++) {
            if (checkValues[i] == false)
                return i + 1;
        }
        return i + 1;
    }

    public static int firstMissingPositiveMethod2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            if (val >= 1 && val <= nums.length) {
                if (nums[val - 1] > 0)
                    nums[val - 1] *= -1;
                else if (nums[val - 1] == 0) {
                    nums[val - 1] = -1 * (nums.length + 1);
                }
            }
        }
        for (int i = 1; i < nums.length + 1; i++) {
            if (nums[i - 1] >= 0) {
                return i;
            }
        }
        return nums.length + 1;
    }
}
