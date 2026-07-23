class Solution {

    public int maxProfit(int[] prices) {

        // Minimum buying price seen so far.
        int buyPrice = prices[0];

        // Maximum profit found till now.
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Update the buying price if a lower price is found.
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {

                // Profit if we sell on the current day.
                int currentProfit = prices[i] - buyPrice;

                // Keep the maximum profit.
                profit = Math.max(currentProfit, profit);
            }
        }

        return profit;
    }
}