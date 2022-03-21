package DSABootcampJava.arrays05.medium;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    // ? https://leetcode.com/problems/spiral-matrix/
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        System.out.print("Output : " + spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        int left = 0, right = c - 1;
        int top = 0, bottom = r - 1;

        while ((r * c) > list.size()) {

            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }

            for (int i = top + 1; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }

            if (top != bottom) {
                for (int i = right - 1; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }
            if(left != right){
            for (int i = bottom - 1; i > top; i--) {
                list.add(matrix[i][left]);
            }
        }
            // Updation
            left++;
            right--;
            top++;
            bottom--;
        }
        return list;
    }
}
