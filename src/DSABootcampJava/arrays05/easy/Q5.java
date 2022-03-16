package DSABootcampJava.arrays05.easy;

import java.util.Arrays;

public class Q5 {
    // ? https://leetcode.com/problems/shuffle-the-array/
    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 4, 7 };
        Q5 obj = new Q5();
        System.out.println("Output : " + Arrays.toString(obj.shuffle(arr, arr.length / 2)));
    }

    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = i % 2 == 0 ? nums[i / 2] : nums[n + i / 2];
        }
        return arr;
    }
}
