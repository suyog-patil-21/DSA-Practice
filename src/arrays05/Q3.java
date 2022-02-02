package arrays05;

import java.util.Arrays;

// https://leetcode.com/problems/running-sum-of-1d-array/
public class Q3 {
    public static void main(String[] args) {
        System.out.println("Output : " + Arrays.toString(runningSum(new int[] { 1, 1, 1, 1, 1 })));
    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
