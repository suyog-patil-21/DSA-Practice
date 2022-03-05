package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

public class Q25 {
    // ? Kunal is allowed to go out with his friends only on the even days of a
    // given month.
    // ? Write a program to count the number of days he can go out in the month of
    // August.
    public static void main(String[] args) {
        int monthNo = 8;
        int days = 0;
        switch (monthNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                System.out.println("No a Month");
        }
        System.out.println("Even Number of days in the 8th month is :" + (days / 2));
    }

}
