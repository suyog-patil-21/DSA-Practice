package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

public class Q6 {
    // ? Calculate Commission Percentage
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Sales Price : ");
        double price = scan.nextDouble();
        System.out.println("Enter Commission price : ");
        double commissionPercentage = scan.nextDouble();

        System.out.println("Commsion is : " + price * (commissionPercentage / 100.0));
        scan.close();
    }
}
