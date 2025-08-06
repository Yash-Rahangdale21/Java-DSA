public class Stock{
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;  // Update minimum price so far
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);  // Update max profit
            }
        }

        System.out.println("Max Profit: " + maxProfit);
    }
}

