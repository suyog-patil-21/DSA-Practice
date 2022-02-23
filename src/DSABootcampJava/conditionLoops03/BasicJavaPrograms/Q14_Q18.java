package DSABootcampJava.conditionLoops03.BasicJavaPrograms;

public class Q14_Q18 {
    public static void main(String[] args) {
        Volume volume = new Volume();
        System.out.println("Volume Cone :" + volume.cone(10, 3)+" unit^3");
        System.out.println("Volume Rectangular Prism :" + volume.prism(10, 20, 30)+" unit^3");
        System.out.println("Volume Cylinder :" + volume.cyclinder(20, 3)+" unit^3");
        System.out.println("Volume Sphere :" + volume.sphere(25, 3)+" unit^3");
        System.out.println("Volume Pyramid :" + volume.pyramid(30, 15, 20)+" unit^3");
    }

}

class Volume {
    // ? Q14 Volume Of Cone Java Program
    double cone(double height, double radius) {
        return Math.PI * radius * radius * height / 3;
    }

    // ? Q15 Volume Of Prism Java Program
    // Rectangular Prism
    double prism(double height, double width, double length) {
        return height * width * length;
    }

    // ? Q16 Volume Of Cylinder Java Program
    double cyclinder(double height, double radius) {
        return Math.PI * radius * radius * height;
    }

    // ? Q17 Volume Of Sphere Java Program
    double sphere(double height, double radius) {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }

    // ? Q18 Volume Of Pyramid Java Program
    double pyramid(double height, double width, double length) {
        return prism(height, width, length) / 3;
    }
}