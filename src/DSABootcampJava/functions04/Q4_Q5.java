package DSABootcampJava.functions04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4_Q5 {
    // your own method.
    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        System.out.println("Enter a=");
        double a = Double.parseDouble(br.readLine());
        System.out.println("Enter b=");
        double b = Double.parseDouble(br.readLine());
        System.out.println("Addition : " + addTwo(a, b));
        System.out.println("Multiplication : " + multTwo(a, b));
    }

    // ? Write a program to print the sum of two numbers entered by user by defining
    public static double addTwo(double a, double b) {
        return a + b;
    }

    // ? Define a method that returns the product of two numbers entered by user.
    public static double multTwo(double a, double b) {
        return a * b;
    }
}
