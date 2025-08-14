public class CandyProblem {
    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        // Step 1: Give each child at least 1 candy
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // Step 2: Left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Right to left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Step 4: Sum up candies
        int total = 0;
        for (int candy : candies) {
            total += candy;
        }

        return total;
    }

    // Main method to test in VS Code
    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};  // Example test case
        int result = candy(ratings);
        System.out.println("Minimum candies needed: " + result); // Expected output: 5
    }
}
