package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N :");
        int n = sc.nextInt();
        System.out.println("Sum = "+ n * (n + 1) / 2);
        sc.close();
    }
}
