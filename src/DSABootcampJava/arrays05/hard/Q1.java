package DSABootcampJava.arrays05.hard;

public class Q1 {
    // ? https://leetcode.com/problems/max-value-of-equation/
    public static void main(String[] args) {
        // * case 1 
        // int points[][] = new int[][] { { 1, 3 }, { 2, 0 }, { 5, 10 }, { 6, -10 } };
        // int k = 1;
        // * case 2 
        int points[][] = new int[][] { { -19, -12 }, { -13, -18 }, { -12, 18 }, { -11, -8 }, { -8, 2 }, { -7, 12 },
                { -5, 16 }, { -3, 9 }, { 1, -7 }, { 5, -4 }, { 6, -20 }, { 10, 4 }, { 16, 4 }, { 19, -9 }, { 20, 19 } };
        int k = 6;
        // * case 3
        // int points[][] = new int[][] { { 0,0 }, { 1, -1 },};
        // int k = 1;
        System.out.println("Output : " + findMaxValueOfEquation(points, k));
    }

    // BruteForce approch
    public static int findMaxValueOfEquation(int[][] points, int k) {
        if (points.length < 2)
            return 0;
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < points.length; j++) {
            for (int i = j + 1; i <= points.length - 1; i++) {
                int absValue = Math.abs((points[i][0] - points[j][0]));
                if (absValue <= k) {
                    int calculate = points[i][1] + points[j][1] + absValue;
                    max = Math.max(calculate, max);
                }
            }
        }
        return max;
    }


}
