package DSABootcampJava.conditionLoops03.IntermediateJavaPrograms;

public class Q16 {
    // ? Reverse A String In Java
    public static void main(String[] args) {
        String st = "abcdefghijklmnopqrstuvwxyz";
        StringBuffer sb = new StringBuffer(st);
        System.out.println("Method 1: "+sb.reverse());
        System.out.println("Method 2: "+reverserString(st));
    }

    public static String reverserString(String st) {
        String reverse = "";
        for (int i = st.length()-1; i >= 0; i--)
            reverse = reverse + st.charAt(i);
        return reverse;
    }
}
