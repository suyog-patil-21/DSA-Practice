package DSABootcampJava.firstJava02;

import java.util.Scanner;

public class Q7 {
    // ? To calculate Fibonacci Series up to n numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int a = 0, b = 1, sum;
        sum = a + b;
        System.out.print("Fibonacci Series : ");
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(" " + a);
            } else if (i == 2) {
                System.out.print(" " + b);
            } else {
                System.out.print(" " + sum);
                a = b;
                b = sum;
                sum = a + b;
            }

        }
        input.close();
    }

}
