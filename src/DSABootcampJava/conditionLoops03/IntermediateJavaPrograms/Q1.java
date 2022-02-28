package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

public class Q1 {
    // ? Q1 Factorial Program In Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number for Factorial : ");
        int n = sc.nextInt();
        System.out.println("Factorial : " + factorial(n));
        sc.close();
    }

    public static int factorial(int n) {
        if (n < 0)
            return 0;
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
