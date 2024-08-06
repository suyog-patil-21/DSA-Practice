package DSABootcampJava.searching06.easy;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Q13 {
    // ? https://leetcode.com/problems/intersection-of-two-arrays-ii/
    public static void main(String[] args) {
        // int[] nums1 = new int[]{1,2,2,1}, nums2 =new int[]{2,2};
        // int[] nums1 = new int[] { 4, 9, 5 }, nums2 = new int[] { 9, 4, 9, 8, 4 };
        // int[] nums1 = new int[] { 1, 2 }, nums2 = new int[] { 1, 1 };
        // int[] nums1 = new int[] { 2, 1}, nums2 = new int[] { 1, 1 };
        int[] nums1 = new int[] { 8, 0, 3 }, nums2 = new int[] { 0, 0 };
        System.out.println("Output Method 1: " + Arrays.toString(intersectionMethod1(nums1, nums2)));
        System.out.println("Output Method 2: " + Arrays.toString(intersectionMethod2(nums1, nums2)));
    }

    public static int[] intersectionMethod1(int[] nums1, int[] nums2) {
        int[] smallerArray, largerArray;
        if (nums1.length < nums2.length) {
            smallerArray = nums1;
            largerArray = nums2;
        } else {
            smallerArray = nums2;
            largerArray = nums1;
        }

        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < smallerArray.length; i++) {
            for (int j = 0; j < largerArray.length; j++) {
                if (largerArray[j] >= 0 && smallerArray[i] >= 0 && smallerArray[i] == largerArray[j]) {
                    result.add(smallerArray[i]);
                    smallerArray[i] = -1;
                    largerArray[j] = -1;
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static int[] intersectionMethod2(int[] nums1, int[] nums2) {
        int[] contains = new int[1001];
        int[] containsCopy = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            contains[nums1[i]]++;
        }

        for (int i = 0; i < nums2.length; i++) {
            containsCopy[nums2[i]]++;
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < 1001; i++) {
            if (contains[i] > 0 && containsCopy[i] > 0) {
                for (int j = 0; j < Math.min(contains[i], containsCopy[i]); j++) {
                    result.add(i);
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
