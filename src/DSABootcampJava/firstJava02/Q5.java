package DSABootcampJava.firstJava02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
    // ? Take 2 numbers as input and print the largest number.
    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.print("Enter 2 numbers:");
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        System.out.println("Larger Number is : " + (a > b ? a : b));
        System.out.println("Larger Number is : " + Math.max(a, b));
    }
}
