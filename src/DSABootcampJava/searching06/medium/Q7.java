package DSABootcampJava.searching06.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Q7 {
    // ? https://leetcode.com/problems/find-right-interval/
    public static void main(String arg[]) {
        // int[][] intervals = new int[][] { { 3, 4 }, { 2, 3 }, { 1, 2 } };
        // int[][] intervals = new int[][] { { 1, 4 }, { 2, 3 }, { 3, 4 } };
        // int[][] intervals = new int[][] { { 1, 1 }, { 3, 4 } };
        int[][] intervals = new int[][] { { 4, 5 }, { 2, 3 }, { 1, 2 } };
        System.out.println("Output Method 1: " + Arrays.toString(findRightIntervalMethod1(intervals)));
        System.out.println("Output Method 2: " + Arrays.toString(findRightIntervalMethod2(intervals)));
    }

    public static int[] findRightIntervalMethod1(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[] { -1 };
        }
        int[] results = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            int rightIndex = Integer.MAX_VALUE;
            for (int j = 0; j < intervals.length; j++) {
                if (intervals[i][1] <= intervals[j][0]) {
                    if (rightIndex == Integer.MAX_VALUE) {
                        rightIndex = j;
                    } else {
                        if (intervals[rightIndex][0] >= intervals[j][0]) {
                            rightIndex = j;
                        }
                    }
                }
            }
            results[i] = rightIndex == Integer.MAX_VALUE ? -1 : rightIndex;
        }
        return results;
    }

    public static int[] findRightIntervalMethod2(int[][] intervals) {
        int[] result = new int[intervals.length];
        // Create a duplicate array with index
        List<int[]> intervals1 = new ArrayList<>(intervals.length);
        for (int i = 0; i < intervals.length; i++) {
            intervals1.add(new int[] { intervals[i][0], intervals[i][1], i });
        }
        // Sort the array
        Collections.sort(intervals1, (a, b) -> a[0] - b[0]);

        // loop through each element
        for (int i = 0; i < intervals1.size(); i++) {
            int realArrayIndex = intervals1.get(i)[2];
            int rightInterval = intervals1.get(i)[1];
            System.out.println(Arrays.toString(intervals1.get(i)));
            result[realArrayIndex] = binarySearch(intervals1, rightInterval, i, intervals1.size() - 1);
        }
        return result;
    }

    public static int binarySearch(List<int[]> arr, int target, int start, int end) {
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midEl = arr.get(mid)[0];
            if (midEl >= target) {
                ans = arr.get(mid)[2];
                end = mid - 1;
            }
            else {
                start = mid + 1;
            } 
        }
        return ans;
    }
}
