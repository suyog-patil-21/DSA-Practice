package DSABootcampJava.arrays05;

public class Q14 {
    // ? https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = new int[][] { { 0, 1 }, { 1, 1 } };
        System.out.println("Output :" + oddCellsMethod1(m, n, indices));
        System.out.println("Output :" + oddCellsMethod2(m, n, indices));
    }

    public static int oddCellsMethod1(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int oddCount = 0;
        for (int[] position : indices) {
            for (int j = 0; j < arr[position[0]].length; j++) {
                ++arr[position[0]][j];
            }
            for (int j = 0; j < arr.length; j++) {
                ++arr[j][position[1]];
            }
        }
        for (int[] i : arr) {
            for (int j : i) {
                oddCount += j % 2 == 0 ? 0 : 1;
            }
        }
        return oddCount;
    }

    public static int oddCellsMethod2(int m, int n, int[][] indices) {
        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];
        for (int i = 0; i < indices.length; i++) {
            row[indices[i][0]] ^= true;
            column[indices[i][1]] ^= true;

        }
        int r = 0;
        int c = 0;

        for (boolean i : row) {
            if (i) {
                r++;
            }
        }
        for (boolean i : column) {
            if (i) {
                c++;
            }
        }
        return r * n + c * m - (2 * r * c);
    }
}
