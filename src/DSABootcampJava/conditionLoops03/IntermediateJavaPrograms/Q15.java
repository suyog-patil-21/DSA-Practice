package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

public class Q15 {
    // ? Find Ncr & Npr
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and r for (nPr or nCr) : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Permutation (nPr) : " + (Q1.factorial(n) / Q1.factorial(n - r)));
        System.out.println("Combination (nCr) : " + (Q1.factorial(n) / (Q1.factorial(r) * Q1.factorial(n - r))));
        sc.close();
    }
}
