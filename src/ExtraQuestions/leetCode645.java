package ExtraQuestions;

import java.util.Arrays;

class leetCode645 {
    // ? https://leetcode.com/problems/set-mismatch/submissions/
    public static void main(String[] args) {
        leetCode645 obj = new leetCode645();
        int nums[] = new int[] { 1, 2, 2, 4 };
        System.out.println("Output : " + Arrays.toString(obj.findErrorNums(nums)));
    }

    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, correctIndex, i);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[] { nums[j], j + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

}