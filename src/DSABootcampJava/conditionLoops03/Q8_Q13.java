package DSABootcampJava.conditionLoops03;

public class Q8_Q13 {
    public static void main(String[] args) {
        Perimeter perimeter = new Perimeter();
        System.out.println("Perimeter =>");
        System.out.println("Circle :" + perimeter.circle(12));
        System.out.println("Equilateral Triangle : " + perimeter.equviTriangle(4));
        System.out.println("Parallelogram : " + perimeter.parallelogram(5, 8));
        System.out.println("Rectangle : " + perimeter.rectangle(5, 8));
        System.out.println("Square : " + perimeter.square(2));
        System.out.println("Rhombus : " + perimeter.rhombus(2));
    }

}

class Perimeter {
    // ? Q8 Perimeter Of Circle
    public double circle(double radius) {
        return Math.PI * 2 * radius;
    }

    // ? Q9 Perimeter Of Equilateral Triangle
    public double equviTriangle(double side) {
        return side * 3;
    }

    // ? Q10 Perimeter Of Parallelogram
    public double parallelogram(double height, double width) {
        return rectangle(height, width);
    }

    // ? Q11 Perimeter Of Rectangle
    public double rectangle(double length, double width) {
        return 2 * (length + width);
    }

    // ? Q12 Perimeter Of Square
    public double square(double side) {
        return side * 4;
    }

    // ? Q13 Perimeter Of Rhombus
    public double rhombus(double side) {
        return square(side);
    }
}