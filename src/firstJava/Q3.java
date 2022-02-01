package firstJava;

import java.io.*;

public class Q3 {
    // ? write a program to input principal, time, and rate (P, T, R) from the user
    // and find Simple Interest.
    public static void main(String[] args) throws IOException {
        // input using Buffer method
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        System.out.print("Enter Princple:");
        float p = Float.parseFloat(br.readLine());
        System.out.print("Enter Time:");
        float t = Float.parseFloat(br.readLine());
        System.out.print("Enter Rate:");
        float r = Float.parseFloat(br.readLine());
        float si = (p * t * r) / 100;
        System.out.print("Simple Interest ="+si);
    }
}
