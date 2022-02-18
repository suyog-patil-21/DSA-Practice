package DSABootcampJava.arrays05;

class Q16 {
    // ? https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println("Output : " + findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (containsEven(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean containsEven(int nums) {
        return ((int) Math.log10(nums) + 1) % 2 == 0;
    }
}