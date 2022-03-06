package DSABootcampJava.functions04;

public class Q2 {
    public static void main(String[] args) {
        Q2 obj = new Q2();
        int number = 13;
        System.out.println("Normal Method Even / ODD: "+obj.isEven(number));
        System.out.println("or(|) Method Even / ODD: "+obj.isEven(number));
        System.out.println("And(&) Method Even / ODD: "+obj.isEven(number));
        System.out.println("Xor(^) Method Even / ODD: "+obj.isEven(number));
        System.out.println("Checking Last binary digit Method Even / ODD: "+obj.isEven(number));
    }

    public String isEven(int number) {
        return number % 2 == 0 ? "EVEN" : "ODD";
    }

    public String isBitwiseAndMethodEven(int number) {
        return (number & 1) == 0 ? "EVEN" : "ODD";
    }

    public String isBitwiseOrMethodEven(int number) {
        return (number | 1) > number ? "EVEN" : "ODD";
    }

    public String isBitwiseXorMethodEven(int number) {
        return (number ^ 1) == number + 1 ? "EVEN" : "ODD";
    }

    public String isleastSignificatinMethodEven(int number) {
        return Integer.toBinaryString(number).endsWith("0") ? "EVEN" : "ODD";
    }
}
