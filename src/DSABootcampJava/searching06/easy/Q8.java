package DSABootcampJava.searching06.easy;

public class Q8 {
    // ? https://leetcode.com/problems/kth-missing-positive-number/
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        System.out.print("Output : " + findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (end < 0) {
            return k;
        }
        return arr[end] + (k - (arr[end] - (end + 1)));
    }
}
