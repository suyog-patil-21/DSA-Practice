package DSABootcampJava.arrays05.easy;

public class Q28 {
    // ? https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
    public static void main(String[] args) {
        int[] position = { 2, 2, 2, 3, 3 };
        System.out.print("Output : " + minCostToMoveChips(position));
    }

    public static int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        int length = position.length;
        for (int i : position) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if (even == length || odd == length)
            return 0;
        return Math.min(even, odd);
    }
}
