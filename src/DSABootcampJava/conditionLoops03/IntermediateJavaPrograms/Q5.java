package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

import java.util.Scanner;

public class Q5 {
    // ? Calculate Distance Between Two Points
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the staring co-ordinates (x,y)  : ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.print("Enter the Ending co-ordinates (x,y)  : ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        System.out.println("Distance between point : " + Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        scan.close();
    }
}
