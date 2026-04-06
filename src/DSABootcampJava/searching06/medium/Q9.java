package DSABootcampJava.searching06.medium;

public class Q9 {
    // ? *
    // https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/description/
    public static void main(String[] args) {
        int n = 4, index = 2, maxSum = 6;
        System.out.println("Method 1: " + maxValueMethod1(n, index, maxSum));
    }

    public static long getSum(int count, int val) {
        if (count == 0)
            return 0;
        // If the sequence drops to 1 before running out of space
        if (val <= count) {
            long actualSum = (long) val * (val + 1) / 2;
            return actualSum + (count - val); // Add 1s for the remaining slots
        }
        // If the sequence is still > 1 at the end of the space (Trapezoid)
        long first = val;
        long last = val - count + 1;
        return (first + last) * count / 2;
    }

    public static int maxValueMethod1(int n, int index, int maxSum) {
        long beg = 1, end = maxSum;
        int result = 1;

        while (beg <= end) {
            long mid = beg + (end - beg) / 2;

            // Sum to the left (excluding mid)
            long leftSum = getSum(index, (int) mid - 1);
            // Sum to the right (excluding mid)
            long rightSum = getSum(n - index - 1, (int) mid - 1);

            if (leftSum + mid + rightSum <= maxSum) {
                result = (int) mid;
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
