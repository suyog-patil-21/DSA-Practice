package DSABootcampJava.searching06.easy;

public class Q11 {
    // ? https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
    public static void main(String[] args) {
        int[][] grid = new int[][] {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 } };
        System.out.println("Output Method 1 : " + countNegativesMethod1(grid));
        System.out.println("Output Method 2 : " + countNegativesMethod2(grid));
    }

    // Time complexity : O(N^2)
    public static int countNegativesMethod1(int[][] grid) {
        int cols = grid.length;
        int rows = grid[0].length;
        int count = 0;
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // Time Complexity : O(M+N)
    public static int countNegativesMethod2(int[][] grid) {
    int cols = grid.length;
    int rows = grid[0].length;
    int x = 0, y = cols -1 , count =0;
    while(x < rows && y >= 0){
        if(grid[y][x] < 0){
            count = count+(rows - x);
            y--;
        }else{
            x++;
        }
    }
    return count;
    }
}
