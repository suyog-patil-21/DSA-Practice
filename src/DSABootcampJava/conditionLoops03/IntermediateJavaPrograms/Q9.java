package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

public class Q9 {
    // ? Calculate Batting Average
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Runs");
        int runs = scan.nextInt();
        System.out.println("Enter Matches");
        int matches = scan.nextInt();
        System.out.println("Enter No-Outs");
        int notOut = scan.nextInt();
        int outs = matches - notOut;
        if (outs == 0) {
            System.out.print("NA");
        } else {
            System.out.println("Batting Average : " +( runs / outs));
        }
        scan.close();
    }
}
