package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

public class Q3 {
    // ? Calculate Average Of N Numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.MIN_VALUE, count = 1;
        double sum = 0.0;
        System.out.println("Enter 0 to exit \nEnter numbers to Average:");
        while (number != 0) {
            number = sc.nextInt();
            if (number == 0) {
                count--;
                break;
            }
            sum += number;
            count++;
        }

        System.out.println("Average : " + (sum / count));
        sc.close();
    }
}
