package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

public class Q22 {
    // ? Perfect Number In Java
    public static void main(String[] args) {
        System.out.println("Perfect number : "+isPerfectNumber(496));
    }

    public static boolean isPerfectNumber(int num) {
        int temp = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                temp += i;
        }
        return temp == num;
    }

}
