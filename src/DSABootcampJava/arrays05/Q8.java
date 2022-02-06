package DSABootcampJava.arrays05;

import java.util.Arrays;

public class Q8 {
    // ?
    // https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    public static void main(String[] args) {
        int[] inputArray = new int[] { 8, 1, 2, 2, 3 };
        System.out.println("output : " + Arrays.toString((new Q8()).smallerNumbersThanCurrentMethod2(inputArray)));
    }

    // ?Brute force
    public int[] smallerNumbersThanCurrentMethod1(int[] nums) {

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j] && i != j) {
                    result[i]++;
                }
            }
        }
        return result;
    }

    // * Optimal Question
    /**
     * Constains
     * 2 <= nums.length <= 500
     * 0 <= nums[i] <= 100
     */
    public int[] smallerNumbersThanCurrentMethod2(int[] nums) {
        int[] temp = new int[101];
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
        }
        for (int i = 1; i < 101; i++) {
            temp[i] = temp[i] + temp[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = 0;

            } else {
                result[i] = temp[nums[i] - 1];
            }
        }
        return result;
    }
}
