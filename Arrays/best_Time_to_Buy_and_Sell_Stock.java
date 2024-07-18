package Arrays;

public class best_Time_to_Buy_and_Sell_Stock {
    
    class Solution {
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length == 0) {
                return 0;
            }
    
            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;
    
            for (int price : prices) {
                if (price < minPrice) {
                    minPrice = price;  
                } else if (price - minPrice > maxProfit) {
                    maxProfit = price - minPrice;  
                }
            }
    
            return maxProfit;
        }
    }
    
}
