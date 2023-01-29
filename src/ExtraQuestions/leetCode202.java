package ExtraQuestions;

public class leetCode202 {
    // ? https://leetcode.com/problems/happy-number/
    public static void main(String[] args) {
        // int n = 2;
        int n = 19;
        System.out.println("Output : " +isHappy(n));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = findSquareSum(slow);
            fast = findSquareSum(findSquareSum(fast)); 
        }while(slow != fast);
        if(slow == 1)return true;
        return false;
    }

    public static int findSquareSum(int n){
        int ans= 0;
        while(n > 0){
            int rem = n % 10;
            ans = ans + (rem * rem);
            n /=10;
        }
        return ans;
    }
}
