package DSABootcampJava.arrays05;

public class Q19 {
    // ? Q19 https://leetcode.com/problems/maximum-population-year/
    public static void main(String[] args) {
        int[][] logs = new int[][] { { 1950, 1961 }, { 1960, 1971 }, { 1970, 1981 } };
        System.out.println("Population max in year : " + maximumPopulationMethod1(logs));
        System.out.println("Population max in year : " + maximumPopulationMethod2(logs));
    }

    public static int maximumPopulationMethod1(int[][] logs) {
        int arr[] = new int[101];
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                arr[j - 1950]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int year = logs[0][0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                year = 1950 + i;
                max = arr[i];
            }
        }
        return year;
    }

    // Optimized
    public static int maximumPopulationMethod2(int[][] logs) {
        int arr[] = new int[101];
        for (int i = 0; i < logs.length; i++) {
            arr[logs[i][0] - 1950]++;
            arr[logs[i][1] - 1950]--;
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        int max = Integer.MIN_VALUE;
        int year = logs[0][0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                year = 1950 + i;
                max = arr[i];
            }
        }
        return year;
    }
}
