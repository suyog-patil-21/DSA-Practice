package ExtraQuestions;

public class leetCode287 {
    // ? https://leetcode.com/problems/find-the-duplicate-number/
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 5, 2, 2, 6, 2 };
        System.out.println("Output : " + findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            // becasuse there is only one element repeated
            if (nums[i] != i + 1) {
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void swap(int[] arr, int firstElement, int secondElement) {
        int temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = temp;
    }
}
