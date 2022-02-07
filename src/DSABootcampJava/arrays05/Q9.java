package DSABootcampJava.arrays05;

import java.util.Arrays;

public class Q9 {
    // ? https://leetcode.com/problems/create-target-array-in-the-given-order/
    public static void main(String[] args) {
        // Both Array of same Length
        int arr[] = new int[] { 0, 1, 2, 3, 4 };
        // { 0, 1, 0 };
        int index[] = new int[] { 0, 1, 2, 2, 1 };
        // { 0, 1, 0 };
        System.out.println("Output: " + Arrays.toString(createTargetArray(arr, index)));
    }

    /**
     * Constrains
     * 1 <= nums.length, index.length <= 100
     * nums.length == index.length
     * 0 <= nums[i] <= 100
     * 0 <= index[i] <= i
     * 
     * @param nums
     * @param index
     * @return
     */
    public static int[] createTargetArray(int[] nums, int[] index) {
        int target[] = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            target[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (target[index[i]] != -1) {
                for (int j = i; j > index[i]; j--) {
                    target[j] = target[j - 1];
                }
            }
            target[index[i]] = nums[i];
        }

        return target;
    }
}
