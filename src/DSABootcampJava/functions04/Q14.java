package DSABootcampJava.functions04;

public class Q14 {
    // ? Write a function that returns the sum of first n natural numbers.
    public static void main(String[] args) {
        System.out.print("Sum of N natrual Number=" + sumOfNatural(5));
    }

    public static int sumOfNatural(int number) {
        if (number != 0)
            return number + sumOfNatural(number - 1);
        else
            return number;
    }

}
