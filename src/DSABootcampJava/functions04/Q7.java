package DSABootcampJava.functions04;

public class Q7 {
    // ? Define a method to find out if a number is prime or not.
    public static void main(String[] args) {
        int number = 113;
        System.out.println("Prime : " + isPrime(number));
    }

    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        int i = 2;
        while ((i * i) <= number) {
            if (number % i == 0)
                return false;
            i++;
        }
        return true;
    }
}
