package DSABootcampJava.firstJava02;

import java.util.Scanner;

public class Q7 {
    // ? To calculate Fibonacci Series up to n numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        fibonacci(n);
        System.out.println("Fibonacci of n th : " + recurrencefibonaci(n));
        input.close();
    }

    // ? normal method
    static void fibonacci(int n) {
        int a = 0, b = 1;
        if (n < 0) {
            return;
        }
        System.out.println("Fibonacci Series : ");

        for (int i = 0; i <= n; i++) {

            System.out.print(" " + a);
            int sum = a + b;
            a = b;
            b = sum;

            System.out.println();
        }
    }

    // ? Recursion Method
    // * returns the nth fibonace number
    // this is a type of linear recurrence
    static int recurrencefibonaci(int n) {
        if (n < 2) {
            return n;
        }
        return recurrencefibonaci(n - 1) + recurrencefibonaci(n - 2);
    }
}
