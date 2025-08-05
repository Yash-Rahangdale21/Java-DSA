public class MountAndValley {
    public static void main(String[] args) {
        int nums[] = {1, 2, 1, 3, 2, 1, 4, 5, 4};
        int count = 0;
        int n = nums.length;

        for (int i = 1; i < n - 1; i++) {
            // Skip if same as previous (we'll handle it in the next loop)
            if (nums[i] == nums[i - 1]) continue;

            // Find left non-equal neighbor
            int left = i - 1;
            while (left >= 0 && nums[left] == nums[i]) {
                left--;
            }

            // Find right non-equal neighbor
            int right = i + 1;
            while (right < n && nums[right] == nums[i]) {
                right++;
            }

            if (left >= 0 && right < n) {
                if (nums[i] > nums[left] && nums[i] > nums[right]) {
                    count++; // hill
                } else if (nums[i] < nums[left] && nums[i] < nums[right]) {
                    count++; // valley
                }
            }
        }

        System.out.println("Number of hills and valleys: " + count);
    }
}

