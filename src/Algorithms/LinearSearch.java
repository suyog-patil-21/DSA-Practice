package Algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 5, 6, 72, 23 };
        int target = 11;
        int result = linearSearch(array, target);
        if (result == -1) {
            System.out.println("No Present in the list");
        } else {

            System.out.println("Target present at: " + result);
        }
    }
    /**
     * linearly search element is present in the array or not.
     * @param arr
     * @param target
     * @return if the target element is found then returns index of the element or else -1 if not found.
     */
    public static int linearSearch(int[] arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }
}
