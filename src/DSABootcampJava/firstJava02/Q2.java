package DSABootcampJava.firstJava02;

import java.util.Scanner;

public class Q2 {
    // ? Take name as input and print a greeting message for that particular name.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.next();
        System.out.print(name + ", Hello to coding");
        in.close();
    }
}
