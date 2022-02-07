package DSABootcampJava.firstJava02;

import java.util.Scanner;

public class Q9 {
    // ? To find Armstrong Number between two given number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter starting Number : ");
        int start = in.nextInt();
        System.out.println("Enter ending Number : ");
        int end = in.nextInt();
        System.out.println("Armstring Number are : ");
        armstrongBetween(start, end);
        in.close();
    }

    /**
     * Find Armstrong number between start and end
     * 
     * @param start
     * @param end
     */
    private static void armstrongBetween(int start, int end) {
        if (start < end) {
            for (int i = start; i <= end; i++) {
                if (isArmstrong(i) != -1) {
                    System.out.println(" " + i);
                }
            }
        } else {
            System.out.println("start is greater than end");
        }
    }

    /**
     * Count the Number of the digit in the Number
     * 
     * @param number
     * @return returns the length of the intger digit
     */
    static int countDigit(int number) {
        return (int) Math.floor(Math.log10(number) + 1);
    }

    /**
     * Armstrong Number for any number length
     * 
     * @param number
     * @return return result if it is Armstrong else -1.
     */
    public static int isArmstrong(int number) {
        int temp = number;
        int result = 0, d = 0;
        int power = countDigit(number);
        while (number != 0) {
            d = number % 10;
            result += (int) Math.pow(d, power);
            number /= 10;
        }
        if (temp == result)
            return result;
        return -1;
    }
}
