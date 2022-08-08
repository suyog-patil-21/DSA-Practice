package DSABootcampJava.arrays05.medium;

import java.util.Arrays;

public class Q8 {
    // ? https://leetcode.com/problems/rotate-array/
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int k = 3;
        rotate(nums, k);
        System.out.println("Output : " + Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        if (k >= length)
            k = k % length;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[length - k + i];
        }
        for (int i = length - 1 - k; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
    }
}
