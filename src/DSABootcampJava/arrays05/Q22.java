package DSABootcampJava.arrays05;

import java.util.Arrays;

public class Q22 {
    // ? https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Output : " + Arrays.toString(sumZero(n)));
    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            if (start == end) {
                result[start] = 0;
                break;
            }
            result[start] = (start + 1) * -1;
            result[end] = start + 1;
            start++;
            end--;
        }
        return result;
    }
}
