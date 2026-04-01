package DSABootcampJava.searching06.medium;

// ? 
class Q8 {
    public static void main(String[] args) {
        // int target = 2;
        int target = 3;
        System.out.println("Method 1: "+reachNumber(target));
    }

    public static int reachNumber(int target) {
        target = Math.abs(target);
        int step = 0, sum = 0;
        while (sum < target) {
            ++step;
            sum += step;
        }
        while ((sum - target) % 2 != 0) {
            ++step;
            sum += step;
        }
        return step;
    }
}