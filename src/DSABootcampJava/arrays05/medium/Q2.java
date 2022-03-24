package DSABootcampJava.arrays05.medium;

import java.util.Arrays;

class Q2 {
    // ? https://leetcode.com/problems/spiral-matrix-ii/
    public static void main(String[] args) {
        int n = 4;
        int[][] mat = generateMatrix(n);

        System.out.println("Ouput :");
        for (int[] i : mat) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] generateMatrix(int n) {
        if (n == 0)
            return new int[][] { {} };
        int[][] matrix = new int[n][n];
        int r = matrix.length;
        int c = matrix[0].length;
        int left = 0, right = c - 1;
        int top = 0, bottom = r - 1;
        int count = 1;

        while ((r * c) >= count) {

            for (int i = left; i <= right; i++) {
                matrix[top][i] = count++;
            }

            for (int i = top + 1; i <= bottom; i++) {
                matrix[i][right] = count++;
            }

            if (top != bottom) {
                for (int i = right - 1; i >= left; i--) {
                    matrix[bottom][i] = count++;
                }
            }
            if (left != right) {
                for (int i = bottom - 1; i > top; i--) {
                    matrix[i][left] = count++;
                }
            }
            // Updation
            left++;
            right--;
            top++;
            bottom--;
        }
        return matrix;
    }
}