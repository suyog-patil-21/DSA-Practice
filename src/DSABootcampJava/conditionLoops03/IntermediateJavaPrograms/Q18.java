package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

public class Q18 {
    // ? Future Investment Value
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the present value :");
        double presentPrice = sc.nextDouble();
        System.out.println("Enter the interest rate paid by the investment :");
        double rate = sc.nextDouble();
        System.out.println("Enter the Peroid in years:");
        double peroid = sc.nextDouble();
        System.out.println("Future Value : " + (presentPrice * Math.pow((1 + rate/100.0), peroid)));
        sc.close();
    }
}
