package firstJava;

import java.util.*;

public class Q1 {
    // ? Write a program to print whether a number is even or odd, also take input
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = scan.nextInt();
        if (number % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
