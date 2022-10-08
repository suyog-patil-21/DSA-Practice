package DSABootcampJava.arrays05.medium;

class Q10 {
    // ? https://leetcode.com/problems/house-robber/
    public static void main(String[] args) {
        int[] nums = { 2, 7, 9, 3, 1 };
        System.out.println("Output : " + rob(nums));
    }
    public static int rob(int[] nums) {
        int rob1=0,rob2 =0;
        for (int  item : nums){
            int temp  = Math.max(rob1+item,rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}