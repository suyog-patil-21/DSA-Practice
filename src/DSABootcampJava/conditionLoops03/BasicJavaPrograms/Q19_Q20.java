package DSABootcampJava.conditionLoops03.BasicJavaPrograms;

public class Q19_Q20 {
    public static void main(String[] args) {
        Q19_Q20 obj = new Q19_Q20();
        System.out.println("Area : " + obj.curvedSurfaceAreaOfClinder(20, 30));
        System.out.println("Area : " + obj.totalSurfaceAreaOfCube(40));
    }

    // ? Q19 Curved Surface Area Of Cylinder
    double curvedSurfaceAreaOfClinder(double radius, double height) {
        return 2 * Math.PI * radius * height;
    }

    // ? Q20 Total Surface Area Of Cube
    double totalSurfaceAreaOfCube(double side) {
        return 6 * side * side;
    }
}
