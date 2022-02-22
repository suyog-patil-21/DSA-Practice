package DSABootcampJava.arrays05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q18 {
    // ? https://leetcode.com/problems/add-to-array-form-of-integer/
    public static void main(String[] args) {
        int[] num = { 1, 2, 0, 0 };
        int k = 34;
        System.out.println("Output : " + addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length;
        int sum = k;
        List<Integer> list = new ArrayList<>();
        while (--i >= 0 || sum > 0) {
            if (i >= 0) {
                sum += num[i];
            }
            list.add(sum % 10);
            sum /= 10;
        }
        Collections.reverse(list);
        return list;
    }

}
