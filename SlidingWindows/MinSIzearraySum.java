

public class MinSIzearraySum {
    public static void main(String[] args) {
        int [] arr = {2,3,1,2,4,3};
        int k = 7;
        int n = arr.length;
        int i = 0, j = 0, sum = 0, minLength = Integer.MAX_VALUE;
        while (j < n) {
            sum += arr[j]; // Expand the window by adding the rightmost element
            while (sum >= k) { // Contract the window from the left
                minLength = Math.min(minLength, j - i + 1);
                sum -= arr[i]; // Remove the leftmost element
                i++;
            }
            j++; // Move the right pointer to expand the window
        }
        if(minLength == Integer.MAX_VALUE) {
            System.out.println("No subarray found with sum >= " + 0);
        } else {
            System.out.println("Minimum size of subarray with sum >= " + k + " is: " + minLength); // gh
        }
}










}

