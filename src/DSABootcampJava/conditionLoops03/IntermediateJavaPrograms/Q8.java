package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

public class Q8 {
    // ? Calculate Depreciation of Value
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Price of the article");
        double price = scan.nextDouble();
        System.out.println("Enter Rate in percentage");
        double rate = scan.nextDouble();
        System.out.println("Enter Time in number of year");
        double time = scan.nextDouble();
        System.out.println(
                "Depreciation of value " + price + " after " + time + "years at rate " + rate + ": "
                        + (price - (price * Math.pow((1 - rate / 100), time))));
        scan.close();
    }
}
