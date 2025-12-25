public class StockPrice {
    public static void main(String[] args) {
        int[] prices = {7,3,0,2,5,8,1};
        int n  = prices.length;
        int maxProfit = 0;
        int buyprice = Integer.MAX_VALUE;

       for(int i =0;i<n;i++){

            // market closed
            if (prices[i] == 0) continue;
           

            // buying condition
            if (prices[i] < buyprice && i != n - 1) {
                buyprice = prices[i];
                
            }
            // selling condition
            else if (prices[i] - buyprice > maxProfit) {
                maxProfit = prices[i] - buyprice;
                
            }
        }
        int sellPrice = buyprice + maxProfit;
        System.out.println("Buy Price  : " + buyprice);
        System.out.println("Sell Price : " + sellPrice);
        System.out.println("Profit     : " + maxProfit);
    }
}
