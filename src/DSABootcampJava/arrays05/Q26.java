package DSABootcampJava.arrays05;

import java.util.Arrays;

public class Q26 {
    // ? https://leetcode.com/problems/plus-one/
    public static void main(String[] args) {
        int[] digits = {9,9,9};
        System.out.println("Output : "+Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;

        while (i >= 0) {
            if ((digits[i] + 1) > 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
            i--;
        }
        if(digits[0] == 0){
            int arr[] = new int[digits.length+1];
            arr[0] = 1;
            for(i = 0;i < digits.length;i++){
                arr[i+1] = digits[i];
            }
            return arr;
        }
        return digits;
    }
}
