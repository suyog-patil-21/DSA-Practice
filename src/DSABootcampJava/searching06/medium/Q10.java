package DSABootcampJava.searching06.medium;

public class Q10 {
    // ? https://leetcode.com/problems/koko-eating-bananas/description/
    public static void main(String[] args) {
        int[] piles = new int[]{3, 6, 7, 11};
        int h = 8;
        System.out.println("Method 1: " + minEatingSpeed(piles, h));
    }

    public static boolean checkCanEat(int[] piles, int count, int h) {
        long totalHours = 0; // Use long to prevent overflow for large inputs
        for (int pile : piles) {
            // Efficient way to calculate ceiling: (pile + count - 1) / count
            totalHours += (pile + count - 1) / count;
        }
        return totalHours <= h;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int beg = 1;
        int max = 0;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        int end = max;

        // Binary Search for the minimum k
        while (beg < end) {
            int mid = beg + (end - beg) / 2;
            if (checkCanEat(piles, mid, h)) {
                // If she can eat at this speed, try a slower speed (smaller mid)
                end = mid;
            } else {
                // If she can't eat, she must go faster
                beg = mid + 1;
            }
        }
        return beg; // beg will be the minimum speed
    }
}