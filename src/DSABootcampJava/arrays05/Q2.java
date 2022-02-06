package DSABootcampJava.arrays05;
import java.util.Arrays;

public class Q2 {
    // ? https://leetcode.com/problems/concatenation-of-array/
    public static void main(String[] args) {
        System.out.print("Array" + Arrays.toString(getConcatenation(new int[] { 1, 2, 3 })));
    }

    public static int[] getConcatenation(int[] nums) {
        int length = nums.length;

        int arr[] = new int[2 * length];
        for (int i = 0; i < length; i++) {
            arr[i] = nums[i];
            arr[i + length] = nums[i];
        }
        return arr;
    }
}
