package DSABootcampJava.arrays05.easy;

import java.util.Arrays;

public class Q17 {
    // ? https://leetcode.com/problems/transpose-matrix/
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println("Output : ");
        for (int[] row : transpose(matrix))
            System.out.println(Arrays.toString(row));
    }

    public static int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int[][] arr = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }
}
