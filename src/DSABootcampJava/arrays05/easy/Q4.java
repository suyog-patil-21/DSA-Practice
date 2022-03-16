package DSABootcampJava.arrays05.easy;

public class Q4 {
    // ? https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args) {
        int[][] wealthCollection = new int[][] { { 1, 2, 3 }, {10,9},{ 3, 2, 1 } };
        Q4 obj = new Q4();
        System.out.println("Max Wealth in the list is " + obj.maximumWealth(wealthCollection));
    }

    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;

        for (int[] user : accounts) {
            int sum = 0;
            for (int i = 0; i < user.length; i++) {
                sum = sum + user[i];
            }
            if (maxWealth < sum) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
