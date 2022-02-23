package DSABootcampJava.conditionLoops03.BasicJavaPrograms;

import java.util.Scanner;

public class Q21 {
    // ? Fibonacci Series In Java Programs
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a last No of the series ");
        int n = scan.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 0; i < n - 2; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        scan.close();
    }
}
