package DSABootcampJava.functions04;

public class Q1 {
    // ? Define two methods to print the maximum and the minimum number respectively
    // ? among three numbers entered by the user.
    public static void main(String[] args) {
        Q1 obj = new Q1();
        System.out.println("Max :" + obj.maxInThree(2, 3, 4));
        System.out.println("Min :" + obj.minInThree(2, 3, 4));
    }

    public int minInThree(int a, int b, int c) {
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        return min;
    }

    public int maxInThree(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }

}
