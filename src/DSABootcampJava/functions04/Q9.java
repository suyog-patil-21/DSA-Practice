package DSABootcampJava.functions04;

public class Q9 {
    // ? Write a program to print the factorial of a number by defining a method
    // named 'Factorial'.
    public static void main(String[] args) {
        System.out.print("Factorial : " + factorial(5));
    }

    public static int factorial(int n) {
        if (n < 0)
            return 0;
        int factorial = 1;
        System.out.print(1);
        for (int i = 2; i <= n; i++) {
            System.out.print("*" + i);
            factorial *= i;
        }
        return factorial;
    }
}
