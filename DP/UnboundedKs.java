import java.util.Arrays;
public class UnboundedKs {
    public static int profit(int i ,int[] wt, int[] val, int c,int [][] dp) {
        if(i==wt.length) return 0;
        if(dp[i][c] != -1) return dp[i][c];
        int skip = profit(i+1, wt, val, c,dp);
        if(wt[i]>c) return dp[i][c] = skip;
        int take = val[i] + profit(i, wt, val, c-wt[i],dp);
        return dp[i][c] = Math.max(take,skip);
    }
    public static void main(String[] args) {
        int[] wt = {1, 2, 3};
        int[] val = {10, 15, 40};
        int c = 6;
        int[][] dp = new int[wt.length+1][c+1];
        for(int[] row : dp) Arrays.fill(row, -1);
        System.out.println(profit(0, wt, val, c, dp));
    }
}
