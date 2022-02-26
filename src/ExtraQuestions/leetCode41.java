package ExtraQuestions;

public class leetCode41 {
    // ? https://leetcode.com/problems/first-missing-positive/
    public static void main(String[] args) {
        leetCode41 obj = new leetCode41();
        int nums[] = new int[] { 7, 8, 9, 11, 12 };
        System.out.println("Output : " + obj.firstMissingPositive(nums));
    }

    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length&& nums[i] != nums[correctIndex]) {
                swap(nums, correctIndex, i);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
