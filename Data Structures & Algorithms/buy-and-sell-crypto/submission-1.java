class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit= 0;
        for (int today = 0; today <= prices.length - 1; today++){
            if(minPrice > prices[today]){
                minPrice = prices[today];
            }
            System.out.println("window - " +minPrice + " to " + prices[today]);
            int tryToSell = prices[today] - minPrice;
            System.out.println("Value today:" + tryToSell);
            maxProfit = Math.max(maxProfit, tryToSell);
     
        }
    
        return maxProfit;
    }
}
