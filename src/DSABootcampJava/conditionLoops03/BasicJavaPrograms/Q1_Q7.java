package DSABootcampJava.conditionLoops03.BasicJavaPrograms;

public class Q1_Q7 {
    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Area =>");
        System.out.println("Circle :" + area.circle(12));
        System.out.println("Right Angle Triangle : " + area.rightTriangle(4, 8));
        System.out.println("Rectangle : " + area.rectangle(5, 8));
        System.out.println("Isosceles Triangle : " + area.isotriangle(5, 8));
        System.out.println("Parallelogram : " + area.parallelogram(5, 8));
        System.out.println("Rhombus : " + area.rhombus(1, 2));
        System.out.println("Equilateral Triangle : " + area.equviTriangle(4));
    }
}

class Area {
    // ? Q1 Area Of Circle Java Program
    public double circle(double radius) {
        return Math.PI * radius * radius;
    }

    // ? Q2 Area Of Triangle
    public double rightTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // ? Q3 Area Of Rectangle Program
    public double rectangle(double width, double height) {
        return width * height;
    }

    // ? Q4 Area Of Isosceles Triangle
    public double isotriangle(double base, double height) {
        return 2 * rightTriangle(base / 2, height);
    }

    // ? Q5 Area Of Parallelogram
    public double parallelogram(double width, double height) {
        return rectangle(width, height);
    }

    // ? Q6 Area Of Rhombus
    public double rhombus(double longDiagonal, double shortDiagonal) {
        return (longDiagonal * shortDiagonal) / 2;
    }

    // ? Q7 Area Of Equilateral Triangle
    public double equviTriangle(double side) {
        return Math.sqrt(3) / 4 * side * side;
    }
}