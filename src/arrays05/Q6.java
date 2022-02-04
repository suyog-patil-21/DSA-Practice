package arrays05;

import java.util.ArrayList;
import java.util.List;

public class Q6 {
    // ? https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        System.out.println("Output : " + kidsWithCandiesMethod1(candies,
                extraCandies));
        System.out.println("Output : " + kidsWithCandiesMethod2(candies,
                extraCandies));
        System.out.println("Output : " + kidsWithCandiesMethod3(candies,
                extraCandies));
        System.out.println("Optimal Output : " + kidsWithCandiesMethod4(candies,
                extraCandies));
    }

    // * rough
    public static List<Boolean> kidsWithCandiesMethod1(int[] candies, int extraCandies) {
        int len = candies.length;
        List<Boolean> flags = new ArrayList<Boolean>(len);
        for (int i = 0; i < len; i++) {
            int count = 0;
            int extraCandieKid = candies[i] + extraCandies;
            for (int j = 0; j < len; j++) {
                if (extraCandieKid >= candies[j]) {
                    count++;
                }
            }
            if (count == len) {

                flags.add(true);
            } else {
                flags.add(false);
            }
        }
        return flags;
    }

    // * bit better
    public static List<Boolean> kidsWithCandiesMethod2(int[] candies, int extraCandies) {
        int len = candies.length;
        List<Boolean> flags = new ArrayList<Boolean>(len);
        for (int i = 0; i < len; i++) {
            boolean check = false;

            for (int j = 0; j < len; j++) {
                if (candies[i] + extraCandies < candies[j]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                flags.add(true);
            } else {
                flags.add(false);
            }
        }
        return flags;
    }

    public static List<Boolean> kidsWithCandiesMethod3(int[] candies, int extraCandies) {
        List<Boolean> flags = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < candies.length; j++) {
            if (max < candies[j]) {
                max = candies[j];
            }
        }
        for (int i : candies) {
            if (i + extraCandies >= max) {
                flags.add(true);
            } else {
                flags.add(false);
            }
        }

        return flags;
    }

    public static List<Boolean> kidsWithCandiesMethod4(int[] candies, int extraCandies) {
        List<Boolean> flags = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < candies.length; j++) {
            max = Math.max(max, candies[j]);
        }
        for (int i : candies) {
            flags.add(i + extraCandies >= max);
        }

        return flags;
    }
}
