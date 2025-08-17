public class Main2 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example test case
        int n = 21, k = 17, maxPts = 10;
        double ans = sol.new21Game(n, k, maxPts);

        System.out.println("Probability = " + ans);
    }
}

class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k - 1 + maxPts) return 1.0;

        double[] dp = new double[n + 1];
        dp[0] = 1.0;
        double windowSum = 1.0;
        double result = 0.0;

        for (int i = 1; i <= n; i++) {
            dp[i] = windowSum / maxPts;

            if (i < k) {
                windowSum += dp[i];  // still drawing
            } else {
                result += dp[i];     // stopped drawing
            }

            if (i - maxPts >= 0) {
                windowSum -= dp[i - maxPts];
            }
        }
        return result;
    }
}
