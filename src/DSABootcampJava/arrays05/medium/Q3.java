package DSABootcampJava.arrays05.medium;

import java.util.Arrays;

public class Q3 {
    // ? https://leetcode.com/problems/spiral-matrix-iii/
    public static void main(String[] args) {
        int row = 5, cols = 6;
        int rStart = 1, cStart = 4;

        System.out.println("output : ");
        int[][] matrix = (new Q3()).spiralMatrixIII(row, cols, rStart, cStart);
        for (int[] i : matrix) {
            System.out.print(Arrays.toString(i));
        }
    }

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int count = 0;
        int len = 0;
        int dir = 0;
        int[][] path = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        result[count++] = new int[] { rStart, cStart };
        while (count < rows * cols) {
            if (dir == 0 || dir == 2)
                len++;
            for (int i = 0; i < len; i++) {
                rStart = rStart + path[dir][0];
                cStart = cStart + path[dir][1];
                if (rStart < 0 || cStart < 0 || cStart >= cols || rStart >= rows)
                    continue;
                result[count++] = new int[] { rStart, cStart };
            }
            dir = (dir + 1) % 4;
        }
        return result;
    }
}
