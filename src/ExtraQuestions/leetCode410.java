package ExtraQuestions;

public class leetCode410 {
    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 10, 8 };
        int m = 2;
        System.out.println("Output : " + splitArray(nums, m));
    }

    public static int splitArray(int[] nums, int m) {
        // * when the array is divided into m(maximum divide) parts max value of the
        // subArray can be this.
        int start = 0;
        // * whebt the subArray is 1 (minmum divide) part the max value is the sum of
        // the array;
        int end = 0;
        // * finding the range [minRange ...,..,.., maxRange] so that we can applying
        // binary search
        // search
        for (int i : nums) {
            start = Math.max(start, i);
            end += i;
        }

        // * binarySearch Method
        // ! minRange == start
        // ! maxRange == end

        while (start < end) {
            int pieces = 1;
            int sum = 0;
            int mid = start + (end - start) / 2;
            // mid is not the index it is a value from the range
            // counting pieces of subArray in the given subarry
            for (int i : nums) {
                if (sum + i > mid) {
                    sum = i;
                    pieces++;
                } else {
                    sum += i;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
