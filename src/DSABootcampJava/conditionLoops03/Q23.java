package DSABootcampJava.conditionLoops03;

import java.util.Scanner;

public class Q23 {
    // ? Input a number and print all the factors of that number (use loops).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to show the Factors :");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                System.out.println(i + " ");
        }
        sc.close();
    }

}
