package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

public class Q4 {
    // ? Calculate Discount Of Product
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Price of the Article :");
        double price = sc.nextDouble();
        System.out.print("Enter Discount percent :");
        double discount = sc.nextDouble();
        double discountedValue = (price * discount / 100.0);
        System.out.print("Price:" + price + "\tDiscount :" + discount + "%\tDiscount amount : " + discountedValue
                + "\tDiscounted Amount : " + (price - discountedValue));
        sc.close();
    }

}
