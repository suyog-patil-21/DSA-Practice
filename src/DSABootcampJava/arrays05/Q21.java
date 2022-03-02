package DSABootcampJava.arrays05;

import java.util.Arrays;

public class Q21 {
    // ? https://leetcode.com/problems/two-sum/
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println("Output : " + Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = { -1, -1 };
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}
