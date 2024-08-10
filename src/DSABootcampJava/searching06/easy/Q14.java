package DSABootcampJava.searching06.easy;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Q14 {
    // ? https://leetcode.com/problems/fair-candy-swap/
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};
        // int[] aliceSizes = {1,2};
        // int[] bobSizes = {2,3};
        // int[] aliceSizes = {2};
        // int[] bobSizes = {1,3};
        System.out.println("Output Method 1: " + Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }
    
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] result=  new int[2];
        int sumA = 0, sumB = 0;
        Set<Integer> setB = new HashSet<Integer>();
        for(int i: aliceSizes){
            sumA+=i;
        }
        for(int i: bobSizes){
            sumB+=i;
            setB.add(i);
        }
        int delta = (sumA - sumB) / 2;
        for(int i: aliceSizes){
            if(setB.contains(i - delta)){
                result[0] = i;
                result[1] = i - delta;
                break;
            }
        }
        return result;
    }
}
