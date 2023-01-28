package DSABootcampJava.searching06.easy;

public class Q10 {

    // ? https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static void main(String[] args) {
        int[] arr = { 0, 10, 5, 2 };
        System.out.print("Output Method 1 : " + peakIndexInMountainArrayMethod1(arr));
        System.out.print("Output Method 2 : " + peakIndexInMountainArrayMethod2(arr));
    }

    // Modified
    public static int peakIndexInMountainArrayMethod2(int[] arr) {
        int beg = 0;
        int end = arr.length - 1;
        while (beg < end) {
            int mid = beg + (end - beg) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                beg = mid + 1;
            }
        }
        return beg;
    }

    public static int peakIndexInMountainArrayMethod1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
                end = end - 1;
            }
        }
        return 1;
    }
}
