package DSABootcampJava.functions04;

public class Q6 {
    // ? Write a program to print the circumference and area of a circle of radius
    // ? entered by user by defining your own method.
    public static void main(String[] args) {
        int radius =4;
        System.out.println("Circle Area : "+circleArea(radius));
        System.out.println("Circle circumference : "+circleCircumference(radius));
    }
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static double circleCircumference(double radius) {
        return Math.PI * 2 * radius;
    }
}
