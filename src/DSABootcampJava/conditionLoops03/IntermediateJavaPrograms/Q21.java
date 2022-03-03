package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

public class Q21 {
    // ? Java Program Vowel Or Consonant
    public static void main(String[] args) {
        System.out.println("Output " + (isVowel('q') ? "vowel" : "Consonant"));
    }

    public static boolean isVowel(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
