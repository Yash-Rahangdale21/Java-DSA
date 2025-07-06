
import java.util.Arrays;



public class FriendsPair {
    static int[] dp;

    /// Normal Recursion
    public static void main(String[] args) {
        int n = 5; // Number of friends
        int pairings = countPairings(n);
        dp = new int[n + 1]; 
        Arrays.fill(dp, -1); 
        int frd= frds(n);
        System.out.println("Total ways to pair " + n + " friends: " + pairings);
        System.out.println("the number of ways to pair " + n + " friends is: " + frd);
    }

    /// memoization
    public static int countPairings(int n) {
        if (n <= 1) return 1; // Base case: 0 or 1 friend can only be paired in one way
        if (n == 2) return 2; // Two friends can either pair or not pair

        // Recursive case: either the nth friend pairs with one of the (n-1) friends,
        // or they do not pair at all.
        return countPairings(n - 1) + (n - 1) * countPairings(n - 2);
    }

    public static int frds(int n ){
        if(n<=2) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = frds(n - 1) + (n - 1) * frds(n - 2);
    }
}
