package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

public class Q19 {
    // ? HCF/GCD Of Two Numbers Program
    public static void main(String[] args) {
        System.out.println("GCD / HCF : " + hcf(10, 13));
    }

    /**
     * HCF / GCD of two numbers
     * @param a
     * @param b
     * @return gcd
     */
    public static int hcf(int a, int b) {
        if (a < b) {
            swap(a, b);
        }
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
