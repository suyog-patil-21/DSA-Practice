package ExtraQuestions;

public class leetCode268 {
    // ? https://leetcode.com/problems/missing-number/
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 0, 1 };
        System.out.println("Cyclic Sort : " + missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != i) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }

        }
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]) {
                return j;
            }
        }
        return nums.length;
    }

    public static void swap(int[] arr, int firstElement, int secondElement) {
        int temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = temp;
    }
}
