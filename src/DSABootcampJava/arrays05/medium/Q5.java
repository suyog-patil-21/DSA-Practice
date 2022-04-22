package DSABootcampJava.arrays05.medium;

import java.util.Arrays;

class Q5 {
    // ? https://leetcode.com/problems/product-of-array-except-self/
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        // System.out.println("Output Method 1: " + Arrays.toString((new
        // Q5()).productExceptSelfMethod1(nums)));
        System.out.println("Output Method 2: " + Arrays.toString((new Q5()).productExceptSelfMethod2(nums)));
        System.out.println("Output Method 3: " + Arrays.toString((new Q5()).productExceptSelfMethod3(nums)));
    }

    // Time Complexity : O(n) using division
    public int[] productExceptSelfMethod1(int[] nums) {
        int product = 1;
        int[] answers = new int[nums.length];
        int count = 0;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                product *= nums[i];
            else {
                count++;
                index = i;
            }
        }
        if (count > 1)
            return answers;
        else if (count == 1) {
            answers[index] = product;
            return answers;
        }

        for (int i = 0; i < nums.length; i++) {

            answers[i] = product / nums[i];
        }

        return answers;
    }

    // Time Complexity : O(m*n)
    public int[] productExceptSelfMethod2(int[] nums) {
        int[] answers = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            answers[i] = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j)
                    continue;
                answers[j] *= nums[i];
            }
        }

        return answers;
    }

    // Time And Space Complexity : O(n) without Division
    public int[] productExceptSelfMethod3(int[] nums) {
        int[] result = new int[nums.length];
        int pre = 1;
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            pre = pre * nums[i - 1];
            result[i] = pre;
        }
        int post = 1;
        for (int i = result.length - 2; i >= 0; i--) {
            post = post * nums[i + 1];
            result[i] = post * result[i];
        }
        return result;
    }
}