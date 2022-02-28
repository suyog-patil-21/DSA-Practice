package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

public class Q10 {
    // ? Calculate CGPA Java Program
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter SGPA of the semisers (press 0 to exit) : ");
        double sum = 0;
        int i = 8;
        while (i > 0) {
            System.out.println("Enter SGPA of SEM " + (8 - i + 1) + " : ");
            double n = scan.nextDouble();
            if (n == 0) {
                i++;
                break;
            }
            sum += n;
            i--;
        }
        System.out.println("SGPA = " + (sum / (8 - i + 1)));
        scan.close();
    }
}
