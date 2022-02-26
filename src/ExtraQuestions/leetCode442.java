package ExtraQuestions;

import java.util.ArrayList;
import java.util.List;

class leetCode442 {
    // ? https://leetcode.com/problems/find-all-duplicates-in-an-array/
    public static void main(String[] args) {
        leetCode442 obj = new leetCode442();
        int nums[] = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println("Output : " + obj.findDuplicates(nums));
    }

    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, correctIndex, i);
            } else {
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                list.add(nums[j]);
            }
        }
        return list;
    }

    static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}