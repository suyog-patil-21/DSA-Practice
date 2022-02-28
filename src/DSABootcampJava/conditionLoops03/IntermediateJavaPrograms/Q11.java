package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

public class Q11 {
    // ? Compound Interest Java Program
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Time period, Principle amount, rate  respectivily");
        double time = scan.nextDouble();
        double princple = scan.nextDouble();
        double rate = scan.nextDouble();
        double amount = (princple * Math.pow((1 + rate / 100.0), time));
        System.out.println("Amount Recieved at End : " + amount + "\nCompound Intrest : " + (amount - princple));
        scan.close();
    }
}
