package DSABootcampJava.searching06.easy;

import java.util.Arrays;

public class Q16 {
    // ?
    // https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

    // TODO: Try to solve it again
    public static void main(String[] args) {
        // int[] nums = { 3, 5 };
        // int[] nums = { 0, 0 };
        // int[] nums = { 1, 1, 2 };
        // int[] nums = { 0, 1, 1, 2, 4 };
        // int[] nums = { 0, 1, 4, 3, 4 };
        // int[] nums = { 0, 4, 3, 0, 4 };
        // int[] nums = { 1, 0, 0, 6, 4, 9 };
        int[] nums = { 3, 9, 7, 8, 3, 8, 6, 6 };
        System.out.println("Output Method 1:" + Q16.specialArrayMethod1(nums));
        System.out.println("Output Method 2:" + Q16.specialArrayMethod2(nums));
    }

    public static int specialArrayMethod1(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int prev = -1;
        int x = nums.length;
        while( i < nums.length) {
            if (nums[i] == x || (prev < x && x < nums[i])) {
                return x;
            }
            while (i + 1< nums.length && nums[i] == nums[i+1]){
                i++;
            }
            
            prev = nums[i];
            i+=1;
            x = nums.length - i;
        }
        return -1;
    }

    public static int specialArrayMethod2(int[] nums) {
        // TODO : Using otherway also    
        return -1;
    }

}
