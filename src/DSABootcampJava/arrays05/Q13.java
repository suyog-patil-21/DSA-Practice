package DSABootcampJava.arrays05;

import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        int[][] image = new int[][] { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        System.out.println("Output : ");
        image = flipAndInvertImage(image);
        for (int[] i : image) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {

            int start = 0;
            int end = image[i].length - 1;

            // condition
            while (start <= end) {
                if (start == end) {
                    image[i][start] = image[i][start] == 1 ? 0 : 1;
                } else {

                    int temp = (image[i][start] == 1) ? 0 : 1;
                    image[i][start] = (image[i][end] == 1) ? 0 : 1;
                    image[i][end] = temp;
                }
                // updation
                start++;
                end--;
            }
        }
        return image;
    }

}
