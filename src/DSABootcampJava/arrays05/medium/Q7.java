package DSABootcampJava.arrays05.medium;

public class Q7 {
    // ? https://leetcode.com/problems/jump-game/
    public static void main(String[] args) {
        int arr[] = new int[] { 2,0 };
        // ! must get false for this [  3,2,1,0,4 ]
        System.out.println("Output : " + canJump(arr));
    }

    public static boolean canJump(int[] nums) {
        int maxjump = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(maxjump<i)
                return false;
            else
                maxjump = Math.max(maxjump,nums[i]+i); 
        }
        return true;
    }

    // Using Recursion
    public static boolean canJumpRec(int index, int[] nums) {
        if (nums.length == 0 || index > nums.length - 1)
            return false;
        if (index >= nums.length - 1)
            return true;

        int maxJump = nums[index];
        boolean flag = false;
        for (int i = maxJump; i >= 1; i--) {
            flag |= canJumpRec(index + i, nums);
            if (flag == true)
                return true;
        }
        return flag;
    }
}
