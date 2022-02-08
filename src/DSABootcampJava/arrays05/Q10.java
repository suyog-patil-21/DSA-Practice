package DSABootcampJava.arrays05;

public class Q10 {
    // ? https://leetcode.com/problems/check-if-the-sentence-is-pangram/
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog"; // TRUE
        // = "thisissentence"; // FALSE

        System.out.println("Pangram : " + checkIfPangramMethod1(sentence));
        System.out.println("Pangram : " + checkIfPangramMethod2(sentence));
    }

    // using for and array
    public static boolean checkIfPangramMethod1(String sentence) {
        boolean arr[] = new boolean[26];
        for (char ch : sentence.toCharArray()) {
            arr[ch - 97] = true;
        }
        for (boolean i : arr) {
            if (i == false)
                return false;
        }
        return true;
    }

    // Using Bitwise operator
    public static boolean checkIfPangramMethod2(String sentence) {
        int result = 0;
        for (int i = 0; i < sentence.length(); i++) {
            result |= 1 << (sentence.charAt(i) - 97);
        }
        if (result == (1 << 26) - 1) {
            return true;
        }
        return false;
    }
}
