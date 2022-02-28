package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

import DSABootcampJava.firstJava02.Q9;

public class Q14 {
    // ? Armstrong Number In Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = sc.nextInt();
        System.out.println("Number is Amstrong : " + (Q9.isArmstrong(number) == -1 ? false : true));
        sc.close();
    }
}
