package DSABootcampJava.arrays05.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Q4 {
    // ? https://leetcode.com/problems/set-matrix-zeroes/
    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 2, 3, 4, 5 } };
        // = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        System.out.println("Output :");
        // (new Q4()).setZeroesMethod1(matrix);
        (new Q4()).setZeroesMethod2(matrix);
        for (int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
    }

    // Space complexity O(m*n)
    public void setZeroesMethod1(int[][] matrix) {
        System.out.println("Method 1 :");
        List<int[]> list = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0)
                    list.add(new int[] { i, j });
            }
        }
        for (int[] i : list) {
            System.out.println(i[0] + " " + i[1]);
            for (int j = 0; j < rows; j++) {
                matrix[j][i[1]] = 0;
            }

            for (int k = 0; k < cols; k++) {
                matrix[i[0]][k] = 0;
            }
        }
    }

    // Space Complexity O(1)
    public void setZeroesMethod2(int[][] matrix) {
        System.out.println("Method 2 :");
        int rows = matrix.length;
        int cols = matrix[0].length;
        int flag = 1;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0)
                flag = 0;
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;

            if (flag == 0)
                matrix[i][0] = 0;

        }
    }
}