package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

public class Q20 {
    // ? LCM Of Two Numbers
    public static void main(String[] args) {
        System.out.println("GCD / HCF : " + lcm(10, 13));
    }

    /**
     * LCM of two numbers
     * HCF * LCM = a * b
     * 
     * @param a
     * @param b
     * @return
     */
    public static int lcm(int a, int b) {
        return (a * b) / Q19.hcf(a, b);
    }

}
