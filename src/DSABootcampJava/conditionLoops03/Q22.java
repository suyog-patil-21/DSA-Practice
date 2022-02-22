package DSABootcampJava.conditionLoops03;

public class Q22 {
    // ? https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
    public static void main(String[] args) {
        System.out.println("Output : " + (new Q22()).subtractProductAndSum(234));
    }

    public int subtractProductAndSum(int n) {
        int d = 0, prod = 1, sum = 0;
        while (n != 0) {
            d = n % 10;
            prod *= d;
            sum += d;
            n /= 10;
        }
        return prod - sum;
    }
}
