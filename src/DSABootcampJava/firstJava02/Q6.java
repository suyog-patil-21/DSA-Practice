package DSABootcampJava.firstJava02;

import java.util.Scanner;

public class Q6 {
    // ? Input currency in rupees and output in USD.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Rupees(INR) : ");
        System.out.println("USD : " + (scan.nextFloat() * 74.63));
        scan.close();
    }
}
