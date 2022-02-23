package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

public class Q2 {
    // ? Q2 Calculate Electricity Bill
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Electricity Calculator \n Enter the units : ");
        int units = sc.nextInt();
        double billingAmount = 0;
        if (units <= 100) {
            billingAmount = units * 1.2;
        } else if (units <= 300) {
            billingAmount = 100 * 1.2 + (units - 100) * 2;
        } else if (units > 300) {
            billingAmount = 100 * 1.2 + 200 * 2 + (units - (100 + 200)) * 3;
        }
        System.out.println("Billing Amount is : " + billingAmount);
        sc.close();
    }
}
