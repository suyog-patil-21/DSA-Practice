package DSABootcampJava.conditionLoops03.BasicJavaPrograms;

import java.util.Scanner;

public class Q24 {
    private final Scanner sc = new Scanner(System.in);

    private void myObjectDestructor() {
        sc.close();
    }

    public static void main(String[] args) {
        Q24 obj = new Q24();
        obj.sumTill0();
        obj.maxTill0();
        obj.sumOf2Nums();
        obj.myObjectDestructor();
    }

    // ? Q24 Take integer inputs till the user enters 0 and print the sum of all
    // numbers.
    void sumTill0() {
        int n = -1;
        int sum = 0;
        while (n != 0) {
            System.out.print("Enter No. : ");
            n = sc.nextInt();
            sum += n;
        }
        System.out.println("Sum = " + sum);
    }

    // ? Q25 Take integer inputs till the user enters 0 and print the largest number
    // from all.
    void maxTill0() {
        int n = -1;
        int max = Integer.MIN_VALUE;
        while (n != 0) {
            System.out.print("Enter No. : ");
            n = sc.nextInt();
            max = Math.max(max, n);
        }
        System.out.println("Max Value = " + max);
    }

    // ? Q26 Addition Of Two Numbers
    void sumOf2Nums() {
        System.out.print("Enter num 1: ");
        int a = sc.nextInt();
        System.out.print("Enter num 2: ");
        int b = sc.nextInt();
        System.out.println("Additon of Two Numbers : " + (a + b));
    }

}
