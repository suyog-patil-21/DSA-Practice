package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

public class Q26 {
    // ? Write a program to print the sum of negative numbers,
    // ? sum of positive even numbers and
    // ? the sum of positive odd numbers from a list of numbers (N) entered by the
    // user.
    // ? The list terminates when the user enters a zero.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = -1;
        int negativeSum = 0, positiveEvenSum = 0, positiveOddSum = 0;
        while (n != 0) {
            System.out.print("Enter number: ");
            n = scan.nextInt();

            if (n < 0) {
                negativeSum += n;
            } else if (n > 0) {
                if (n % 2 == 0) {
                    positiveEvenSum += n;
                } else {
                    positiveOddSum += n;
                }
            }
        }
        System.out.println("Negative Sum :" + negativeSum);
        System.out.println("Positive Even Sum :" + positiveEvenSum);
        System.out.println("Positive Odd Sum :" + positiveOddSum);
        scan.close();
    }
}
