package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

public class Q12 {
    // ? Calculate Average Marks
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        double sum = 0.0;
        System.out.println("Enter Marks to find Average:");
        while (count <= 6) {
            double number = sc.nextDouble();
            sum += number;
            count++;
        }

        System.out.println("Average Marks : " + (sum / (count-1)));
        sc.close();
    }
}
