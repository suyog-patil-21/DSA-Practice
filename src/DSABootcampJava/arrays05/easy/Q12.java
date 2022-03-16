package DSABootcampJava.arrays05.easy;

public class Q12 {
    // ? https://leetcode.com/problems/find-the-highest-altitude/
    public static void main(String[] args) {
        int gain[] = { -5, 1, 5, 0, -7 };
        // = { -4, -3, -2, -1, 4, 3, 2 }; // Output = 0
        System.out.println("Output : " + largestAltitudeMethod1(gain));
        System.out.println("Output : " + largestAltitudeMethod2(gain));
    }

    public static int largestAltitudeMethod1(int[] gain) {
        int high = Integer.MIN_VALUE;
        int altitude[] = new int[gain.length + 1];

        for (int i = 0; i < gain.length; i++) {
            altitude[i + 1] = gain[i] + altitude[i];
        }
        for (int i = 0; i < altitude.length; i++) {
            if (high < altitude[i]) {
                high = altitude[i];
            }
        }
        return high;
    }

    public static int largestAltitudeMethod2(int[] gain) {
        int max = 0;
        int current = 0;
        for (int i : gain) {
            current += i;
            max = Math.max(max, current);
        }
        return max;
    }
}
