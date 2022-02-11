package ExtraQuestions;

public class leetCode852_162 {
    // ? 852. https://leetcode.com/problems/peak-index-in-a-mountain-array/
    // ? 162. https://leetcode.com/problems/find-peak-element/
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 0 };
        System.out.println("Output : " + peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
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

}
