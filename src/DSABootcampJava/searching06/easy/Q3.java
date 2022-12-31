package DSABootcampJava.searching06.easy;

public class Q3 {
    // ? https://leetcode.com/problems/first-bad-version/

    public static void main(String[] args) {
        Q3.bad = 1;
        int n = 1;
        // Q3.bad = 4;
        // int n = 5;
        System.out.println("Output : " + firstBadVersion(n));
    }

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            boolean prev = isBadVersion(mid - 1);
            boolean current = isBadVersion(mid);

            if (current == true && prev == false) {
                return mid;
            } else if (current == true && prev == true) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int bad;

    private static boolean isBadVersion(int version) {
        return bad == version;
    }
}
