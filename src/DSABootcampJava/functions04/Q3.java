package DSABootcampJava.functions04;

public class Q3 {
    // ? A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
    public static void main(String[] args) {
        int age = 18;
        System.out.println("Can I Vote : "+isEligibleForVote(age));
    }

    public static boolean isEligibleForVote(int age) {
        return age >= 18;
    }
}
