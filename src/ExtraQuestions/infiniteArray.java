package ExtraQuestions;

public class infiniteArray {
    // ?
    // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public static void main(String[] args) {
        // ! Here array will be infinit as input
        int[] arr = { 3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170 };
        int target = 170;
        System.out.println(findResult(arr, target));
    }

    /**
     * First expands the the array according the array present. search the element
     * using binary search
     * 
     * @param arr
     * @param target
     * @return
     */
    static int findResult(int[] arr, int target) {
        int start = 0;
        int end = 1;
        // * Checking were the element lies and setting start and end 
        while (target > arr[end]) {
            int nextStart = end + 1;
            end = (end - start + 1) * 2;
            start = nextStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
