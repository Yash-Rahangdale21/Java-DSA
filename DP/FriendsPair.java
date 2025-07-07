
import java.util.Arrays;



public class FriendsPair {
    static int[] dp;

    
    public static void main(String[] args) {
        int n = 1; // Number of friends
        int pairings = countPairings(n);
        System.out.println("Total pair obtain from tabulation " + frdsTab(n));
        dp = new int[n + 1]; 
        Arrays.fill(dp, -1); 
        int frd= frds(n);
        System.out.println("Total ways to pair " + n + " friends: " + pairings);
        System.out.println("the number of ways to pair " + n + " friends is: " + frd);
    }

    /// Normal Recursion
    public static int countPairings(int n) {
        if (n <= 1) return 1; // Base case: 0 or 1 friend can only be paired in one way
        if (n == 2) return 2; // Two friends can either pair or not pair

        // Recursive case: either the nth friend pairs with one of the (n-1) friends,
        // or they do not pair at all.
        return countPairings(n - 1) + (n - 1) * countPairings(n - 2);
    }

    // memoization
    public static int frds(int n ){
        if(n<=2) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = frds(n - 1) + (n - 1) * frds(n - 2);
    }
    // Tabulation
    public static int frdsTab(int n) {

         dp = new int[n + 1];
        dp[0] = 1; 
        dp[1] = 1; 
        dp[2] = 2; 

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
        }
        return dp[n];
    }

}
