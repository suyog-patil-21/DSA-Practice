package DSABootcampJava.functions04;

public class Q8 {
    // ? Write a program that will ask the user to enter his/her marks (out of 100).
    // ? Define a method that will display grades according to the marks entered as
    // ? below:
    /*
     * Marks Grade
     * 91-100 AA
     * 81-90 AB
     * 71-80 BB
     * 61-70 BC
     * 51-60 CD
     * 41-50 DD
     * <=40 Fail
     */
    public static void main(String[] args) {
        float marks = 93.5f;
        System.out.println("Grade : " + getGrades(marks));
    }

    public static String getGrades(float marks) {
        if (90.0f < marks && marks <= 100.0f)
            return "AA";
        else if (80.0f < marks && marks <= 90.0f)
            return "AB";
        else if (70.0f < marks && marks <= 80.0f)
            return "BB";
        else if (60.0f < marks && marks <= 70.0f)
            return "BC";
        else if (50.0f < marks && marks <= 60.0f)
            return "CD";
        else if (40.0f < marks && marks <= 50.0f)
            return "DD";
        return "FAIL";
    }
}
