public class SubsetSum{
    public static void main(String[] args) {
        int [] arr ={2,3,5,6,8,10};
        int target  = 1;
        int [][] dp = new int[arr.length+1][target+1];
        for(int i =0;i<dp.length;i++){
            for(int j= 0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        // i 0 to n-1 | target target to 0
        System.out.println(subsetSum(0,arr,target,dp));
        System.out.println(subset(0,arr,target));
    }
    public static boolean subsetSum(int i,int []arr,int target,int [][] dp){
        if(target == 0) return true;
        if(i==arr.length) return false;
        if(dp[i][target] != -1) return dp[i][target] == 1;
        boolean notTake = subsetSum(i+1, arr, target, dp);
        if(arr[i]>target) return notTake;
        boolean take = subsetSum(i+1, arr, target-arr[i], dp);
        dp[i][target] = take || notTake ? 1 : 0;
        return dp[i][target] == 1;

    }
    public static boolean subset(int i,int []arr,int target){
        if(target == 0) return true;
        if(i==arr.length) return false;
        boolean notTake = subset(i+1, arr, target);
        if(arr[i]>target) return notTake;  // Only for positive numbers
        boolean take = subset(i+1, arr, target-arr[i]);
        return take || notTake;

    }
}