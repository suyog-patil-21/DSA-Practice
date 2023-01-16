package DSABootcampJava.searching06.easy;

public class Q6 {
    // ? https://leetcode.com/problems/arranging-coins/
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Output (method 1) : " + arrangeCoinsMethod1(num));
        System.out.println("Output (method 2) : " + arrangeCoinsMethod2(num));
        System.out.println("Output (method 3) : " + arrangeCoinsMethod3(num));
    }

    public static int arrangeCoinsMethod3(int n) {
        // TODO : try again later
        int start = 0;
        int end = n;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (n >= (mid * (mid + 1) / 2)) {
                start = (int) (mid + 1);
            } else {
                end = (int) (mid - 1);
            }
        }
        return start - 1;
    }

    // TODO : try using the Math Method again
    public static int arrangeCoinsMethod2(int n) {
        return (int) Math.floor(-0.5 + Math.sqrt((double) 2 * n + 0.25));
    }

    public static int arrangeCoinsMethod1(int n) {
        int count = 0;
        while (n >= 0) {
            count++;
            n -= count;
        }
        return count - 1;
    }
}
