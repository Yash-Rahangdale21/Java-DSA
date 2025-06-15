

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int k = 2;
        int n = arr.length;
        int maxSum = 0;
        for(int i = 0;i<n-k+1;i++){
            int sum = 0;
            for(int j = i;j<i+k;j++){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
    }
}
