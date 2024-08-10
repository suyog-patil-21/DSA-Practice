package DSABootcampJava.searching06.easy;

public class Q15{
    // ? https://leetcode.com/problems/check-if-n-and-its-double-exist/
    public static void main(String[] args){
        // int[] arr = new int[]{10,2,5,3};
        int[] arr = new int[]{-20,8,-6,-14,0,-19,14,4};
        // int[] arr = new int[]{3,1,7,11};
        System.out.println("Output Method 1:"+Q15.checkIfExistMethod1(arr));
        System.out.println("Output Method 2:"+Q15.checkIfExistMethod2(arr));
    }

    public static boolean checkIfExistMethod1(int[] arr) {
        for(int i =0;i< arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]== (arr[j]*2) || arr[j] == (arr[i]*2)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkIfExistMethod2(int[] arr) {
        for(int i =0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(i!=j && arr[j] == (arr[i]*2)){
                    return true;
                }
            }
        }
        return false;
    }
}