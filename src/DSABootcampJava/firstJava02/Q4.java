package DSABootcampJava.firstJava02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
    // ? Take in two numbers and an operator (+, -, *, /) and calculate the value.
    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter Two numbers");
        float a = Float.parseFloat(in.readLine());
        float b = Float.parseFloat(in.readLine());
        System.out.println("Enter an operator (+, -, *, /) : ");
        float result = 0;
        switch (in.readLine().charAt(0)) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = b / a;
                break;
            default:
                System.out.println("Wrong Operator");
                break;
        }
        System.out.println("Result : " + result);
    }
}
