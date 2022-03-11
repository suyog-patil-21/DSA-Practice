package DSABootcampJava.functions04;

public class Q12 {
    // ? Write a function to check if a given triplet is a Pythagorean triplet or
    // ? not. (A Pythagorean triplet is when the sum of the square of two numbers is
    // ? equal to the square of the third number).
    // ?
    // https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/
    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 6, 5 };
        System.out.println("PythogoreanTriplet :" + isPythagoreanTripletMethod1(arr));
    }

    public static boolean isPythagoreanTripletMethod1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Calculate square of array elements
                    int x = arr[i] * arr[i], y = arr[j] * arr[j], z = arr[k] * arr[k];
                    if (x == y + z || y == x + z || z == x + y)
                        return true;
                }
            }
        }
        return false;
    }
}
