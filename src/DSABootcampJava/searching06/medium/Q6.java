package DSABootcampJava.searching06.medium;

public class Q6 {
    // ? https://leetcode.com/problems/find-peak-element/
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1,3,5,6,4};
        System.out.println("Output :"+findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length -1 ;
        while (start<end) {
            int mid = start + ( end -start)/2;
            if(nums[mid] < nums[mid +1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
