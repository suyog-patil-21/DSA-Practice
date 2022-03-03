package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

public class Q23 {
    // ? Check Leap Year Or Not
    public static void main(String[] args) {
        int year = 2004;
        System.out.println("Is " + year + " Leap year :" + isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }

}
