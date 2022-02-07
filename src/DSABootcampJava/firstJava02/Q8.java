package DSABootcampJava.firstJava02;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class Q8 {
    // ? To find out whether the given String is Palindrome or not
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
        System.out.println("Enter a String");
        String str = in.readLine();
        System.out.println("Reverse : " + stringPalindromeMethod1(str));
        System.out.println("Reverse : " + stringPalindromeMethod2(str));
        in.close();
    }

    public static String stringPalindromeMethod1(String str) {
        String reverse = "";
        for (char ch : str.toCharArray()) {
            reverse = ch + reverse;
        }
        return reverse;
    }

    public static String stringPalindromeMethod2(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }
}
