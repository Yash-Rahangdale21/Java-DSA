
public class SwofMaximumSumArray {
    public static void main(String[] args) {
        int[] arr = {10,20,1,3,-40,80,10};
        int k = 3;
        int n = arr.length;
        int maxSum = 0;
        int i=0,j=k-1,sum=0;
        for(int a = 0;a<=k-1;a++){ //O(k)
            sum += arr[a];
        }
        i++;j++;
        while (j<n) { // n-k times
            sum = sum - arr[i-1] + arr[j];
            maxSum = Math.max(maxSum, sum);
            i++;
            j++;
        }
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
    }
}
