package Algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 11, 12, 13, 212 };
        int[] desarr = new int[] { 12, 2, 3, -1, -5, -3 };
        int target = 12;
        int result;
        result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("No Present in the list");
        } else {

            System.out.println("Target present at: " + result);
        }
        result = orderAgnosticBinarySearch(desarr, target);
        if (result == -1) {
            System.out.println("No Present in the list");
        } else {

            System.out.println("Target present at: " + result);
        }
        System.out.println("Recursive Binary Search element " + target + " is present at :"
                + recursiveBinarySearch(arr, target, 0, arr.length - 1));
    }

    // Binary search only applicable for Ascending Order or Decending Order
    // depending on the implementation of the user
    // * Ascending Order Binary Search
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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

    // ? Recursive Method for Binary Search
    public static int recursiveBinarySearch(int arr[], int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return recursiveBinarySearch(arr, target, start, mid - 1);
        }
        return recursiveBinarySearch(arr, target, mid + 1, end);
    }

    /**
     * Order Agnostic Binary Search can determine if the sorted array is Ascending
     * or Decending order and search accordingly.
     * Binary Search the element with the time complexity O(log2(N))
     * 
     * @param arr
     * @param target
     * @return if element present in the array then return `index`
     * @return else return -1 if not found.
     */
    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }
            } else {

                if (target < arr[mid]) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}