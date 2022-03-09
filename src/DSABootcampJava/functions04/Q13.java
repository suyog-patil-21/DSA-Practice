package DSABootcampJava.functions04;

import java.util.Scanner;

public class Q13 {
    // ? Write a function that returns all prime numbers between two given numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting and ending value ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            if (isPrime(i))
                System.out.println(i + " ");
        }
        sc.close();
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
