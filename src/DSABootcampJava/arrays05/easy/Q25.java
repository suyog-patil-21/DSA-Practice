package DSABootcampJava.arrays05.easy;

import java.util.Arrays;

class Q25 {
    // ? https://leetcode.com/problems/reshape-the-matrix/
    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int r = 1, c = 4;
        System.out.println("Output : ");
        for (int[] i : matrixReshape(mat, r, c)) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if ((row * col) != (r * c))
            return mat;
        // changing shape
        int[][] result = new int[r][c];
        int rowIndex = 0;
        int colIndex = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[rowIndex][colIndex] = mat[i][j];
                colIndex++;
                if (colIndex == c) {
                    colIndex = 0;
                    rowIndex++;
                }
            }
        }
        return result;
    }
}