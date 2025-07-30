public class MaximumSubArray {
    public static void main(String[] args) {
       int[] nums = {10, 20, 30, 5, 10, 50};
        int n = nums.length;

        int sum = nums[0];
        int max = sum;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];  // increasing, keep adding
            } else {
                sum = nums[i];   // break in increasing, start new subarray
            }
            max = Math.max(max, sum);  // update max in all cases
        }

        System.out.println("Maximum Subarray Sum of Increasing Elements: " + max);
    }
}
