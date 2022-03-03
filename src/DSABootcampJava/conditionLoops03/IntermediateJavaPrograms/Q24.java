package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

public class Q24 {
    // ? Sum Of A Digits Of Number
    public static void main(String[] args) {
        System.out.println("Output : " + sumOfDigit(687));
    }

    public static int sumOfDigit(int num) {
        int sum = 0;

        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
}
