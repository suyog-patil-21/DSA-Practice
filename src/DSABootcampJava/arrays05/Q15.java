package DSABootcampJava.arrays05;

public class Q15 {
    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
        // = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Output : " + diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int start = 0;
        int end = mat[0].length - 1;
        for (int i = 0; i < mat.length; i++) {
            if (start == end) {
                sum = sum + mat[i][start];
                start++;
                end--;
                continue;
            }
            sum = sum + mat[i][start] + mat[i][end];
            start++;
            end--;
        }
        return sum;
    }
}
