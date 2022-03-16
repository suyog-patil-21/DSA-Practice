package DSABootcampJava.arrays05.easy;
import java.util.Arrays;

public class Q1 {
    // ? https://leetcode.com/problems/build-array-from-permutation/
    public static void main(String[] args) {
        // Method 1
        System.out.println("Array Method 1 :" + Arrays.toString(buildArrayMethod1(new int[] { 0, 2, 1, 5, 3, 4 })));
        // Methos 2
        System.out.println("Qptimal Output: Array Method 2 :" + Arrays.toString(buildArrayMethod2(new int[] { 0, 2, 1, 5, 3, 4 })));
    }

    public static int[] buildArrayMethod1(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            arr[i] = nums[nums[i]];
        return arr;
    }

    public static int[] buildArrayMethod2(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            nums[i] = length * (nums[nums[i]] % length) + nums[i];
        }
        for (int i = 0; i < length; i++) {
            nums[i] = nums[i] / length;
        }
        return nums;
    }
}
