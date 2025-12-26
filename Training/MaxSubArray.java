public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7};

        int sum = 0;
        int curr = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if(i==arr.length-1){
                break;
            }
           sum = arr[i] + arr[i - 1]+arr[i+1];
           curr = sum;
           Math.max(curr,sum);

        
    }
    System.out.println("Maximum Subarray Sum = " + Math.max(curr,sum));
}
}
