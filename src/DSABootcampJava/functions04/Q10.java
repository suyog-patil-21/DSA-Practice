package DSABootcampJava.functions04;

public class Q10 {
    public static void main(String[] args) {
        System.out.println("Output is :" + isPalindrome(123));
        System.out.println("Output is :" + isPalindrome(121));
    }

    public static boolean isPalindrome(int n) {
        int temp = n;
        int reverse = 0;

        while (n != 0) {
            int d = n % 10;
            reverse = reverse * 10 + d;
            n /= 10;
        }
        return reverse == temp;
    }

}
