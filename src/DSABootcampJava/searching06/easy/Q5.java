package DSABootcampJava.searching06.easy;

public class Q5 {
    // ? https://leetcode.com/problems/valid-perfect-square/
    public static void main(String[] args) {
        // int num = 16; 
        int num = 2147483647;
        // int num = 14;
        System.out.print("Output : " + isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if ((mid * mid) == num) {
                return true;
            } else if ((mid * mid) < num) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return false;
    }
}
