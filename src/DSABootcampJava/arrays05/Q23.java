package DSABootcampJava.arrays05;

import java.util.ArrayList;
import java.util.List;

public class Q23 {
    // ? https://leetcode.com/problems/lucky-numbers-in-a-matrix/
    public static void main(String[] args) {
        int[][] matrix = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };
        System.out.println("Output : " + luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        int[] minElementInRow = new int[matrix.length];
        int[] maxElementInCol = new int[matrix[0].length];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minElementInRow[index++] = min;
        }
        index = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }

            maxElementInCol[index++] = max;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < minElementInRow.length; i++) {
            for (int j = 0; j < maxElementInCol.length; j++) {
                if (minElementInRow[i] == maxElementInCol[j])
                    list.add(minElementInRow[i]);
            }
        }
        return list;
    }

}
