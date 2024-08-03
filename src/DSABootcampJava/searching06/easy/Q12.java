package DSABootcampJava.searching06.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Q12{

    // ? https://leetcode.com/problems/intersection-of-two-arrays/description/ 
    public static void main(String[] args) {
        // int[] nums1 = new int[]{1,2,2,1}, nums2 =new int[]{2,2}; 
        int[] nums1 = new int[]{4,9,5}, nums2 =new int[]{9,4,9,8,4}; 
        System.out.println("Output Method 1: "+Arrays.toString(intersectionMethod1(nums1,nums2)));
        System.out.println("Output Method 2: "+Arrays.toString(intersectionMethod2(nums1,nums2)));
    }

    public static int[] intersectionMethod1(int[] nums1, int[] nums2) {
        int[] smallerArray, largerArray;
        if (nums1.length < nums2.length){
            smallerArray =  nums1;
            largerArray = nums2;
        }else{
            smallerArray =  nums2;
            largerArray = nums1;
        }
        Set<Integer> result = new HashSet<Integer>();
        for (int i = 0; i < smallerArray.length; i++) {
            for (int j = 0; j < largerArray.length; j++) {
                if(smallerArray[i] == largerArray[j]){
                    result.add(smallerArray[i]);
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static int[] intersectionMethod2(int[] nums1, int[] nums2) {
        boolean[] contains = new boolean[1001];
        for(int i : nums1){
            contains[i] = true;
        }
        int[] rawResult = new int[nums1.length];
        int count = 0; 
        for(int i: nums2){
            if(contains[i]) rawResult[count++] = i;
            contains[i]=false;
        }

        int[] result = new int[count];
        for(int i=0;i<count;i++){
            result[i] = rawResult[i];
        }
        return result;
    }
}
