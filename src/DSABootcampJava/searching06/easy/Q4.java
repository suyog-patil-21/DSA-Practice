package DSABootcampJava.searching06.easy;

import java.util.Arrays;

class Q4 {
    // ? https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

    // TODO: Try to solve it again
    public static void main(String[] args) {
        // int[] numbers = { 2, 3, 4 };
        // int target = 6;
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println("Output: " + Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length-1;
        while(start + 1 < end){
            int mid = start + (end-start)/2;
            if(numbers[start] == (target - numbers[end]))
                return new int[]{start + 1, end + 1};
            else if (numbers[start] < (target-numbers[end])) {
                start = (numbers[mid] < (target-numbers[end])) ? mid : start + 1;
            }else{
                end = (numbers[mid] > (target-numbers[start])) ? mid : end - 1;
            }
        }
        if(numbers[start] == (target - numbers[end]))
            return new int[]{start + 1, end + 1};
        return new int[]{-1,-1};
    }
}