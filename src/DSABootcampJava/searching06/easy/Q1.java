package DSABootcampJava.searching06.easy;

public class Q1 {
    // ? https://leetcode.com/problems/sqrtx/
    public static void main(String[] args) {
        // int x = 30;
        int x = 2147395599;
        System.out.println("output method1 :" + mySqrtMethod1(x));
        System.out.println("output method2 :" + mySqrtMethod2(x));
    }

    public static int mySqrtMethod2(int x) {
        long start = 0;
        long end = x;
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int)mid;
            } else if (mid * mid < x) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (end * end == x) {
            return (int)end;
        }
        return (int)start;
    }

    public static int mySqrtMethod1(int x) {
        return (int) Math.sqrt(x);
    }
}
