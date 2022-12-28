package DSABootcampJava.arrays05.hard;

public class Q3 {
    // ? https://leetcode.com/problems/check-if-it-is-a-good-array/
    public static void main(String[] args) {
        // int[] nums = new int[] { 12, 5, 7, 23 };
        // int[] nums = new int[] { 29,6,10 };
        int[] nums = new int[] { 999999999, 999999997 };
        // int[] nums = new int[] { 6, 10, 15 };
        // int[] nums = new int[] { 3,6 };
        System.out.println("Output:" + isGoodArray(nums));
    }

    public static boolean isGoodArray(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans = gcdMethod2(ans, nums[i]);
        }
        return ans == 1;
    }

    private static int gcdMethod2(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private static int gcd(int a, int b) {
        int min = Math.min(a, b);
        while (min != 0) {
            if (a % min == 0 && b % min == 0) {
                break;
            }
            min--;
        }
        return min;
    }

}
