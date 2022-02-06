package DSABootcampJava.arrays05;

public class Q7 {
    // ? https://leetcode.com/problems/number-of-good-pairs/
    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 3, 1, 1, 3 };
        // ex: input: [1,1,1,1] output : 6
        // System.out.println("Output : " + (new Q7()).numIdenticalPairsMethod1(input));
        System.out.println("Output : " + (new Q7()).numIdenticalPairsMethod2(input));
    }

    public int numIdenticalPairsMethod1(int[] nums) {
        int pair = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    pair++;
                }
            }
        }
        return pair;
    }

    // * optimal Solution
    /**
     * Constrains in the question 
     * 1 <= nums.length <= 100,
     * 1 <= nums[i] <= 100
     */
    public int numIdenticalPairsMethod2(int[] nums) {

        int result = 0;
        int[] constArray = new int[101];
        for (int i = 0; i < nums.length; i++) {
            result += constArray[nums[i]];
            constArray[nums[i]]++;
        }
        return result;
    }
}
