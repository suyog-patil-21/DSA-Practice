package DSABootcampJava.searching06.easy;

public class Q2 {
    
    // ? https://leetcode.com/problems/guess-number-higher-or-lower
    public static void main(String[] args) {
        Q2.pick = 6;
        int n = 10;
        System.out.print("output : " + guessNumber(n));
    }

    public static int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int pickStatus = guess(mid);
            if (pickStatus == 0) {
                return mid;
            } else if (pickStatus < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int pick;
    private static int guess(int num) {
        return num == pick ? 0 : num < pick ? 1 : -1;
    }
}
