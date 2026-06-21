public class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = 0, sellDay = 1;
        int maxProfit = 0;
        while (sellDay < prices.length) {
            if (prices[buyDay] < prices[sellDay]) {
                int profit = prices[sellDay] - prices[buyDay];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyDay = sellDay;
            }
            sellDay++;
        }
        return maxProfit;
    }
}