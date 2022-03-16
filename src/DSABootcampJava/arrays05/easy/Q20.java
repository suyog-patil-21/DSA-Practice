package DSABootcampJava.arrays05.easy;

public class Q20 {
    // ? https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
    public static void main(String[] args) {
        int[][] mat = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
        // = { { 0, 1 }, { 1, 0 } };
        int[][] target = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } };
        // = { { 1, 0 }, { 0, 1 } };
        System.out.println("Output : " + findRotation(mat, target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        boolean flag = false;
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
                sum2 += mat[i][j];
            }
        }
        if (sum != sum2) {
            return false;
        }
        for (int rotate = 0; rotate <= 3; rotate++) {
            flag = checkEqual(mat, target);
            if(flag == true)break;
            mat = flipAndInvertImage(transpose(mat));
        }
        return flag;
    }

    public static boolean checkEqual(int[][] mat, int[][] target) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
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

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {

            int start = 0;
            int end = image[i].length - 1;

            // condition
            while (start <= end) {
                if (start == end) {
                    image[i][start] = image[i][start];
                } else {

                    int temp = image[i][start];
                    image[i][start] = image[i][end];
                    image[i][end] = temp;
                }
                // updation
                start++;
                end--;
            }
        }
        return image;
    }
}
