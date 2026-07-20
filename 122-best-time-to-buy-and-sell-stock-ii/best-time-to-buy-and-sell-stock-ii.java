class Solution {
    public int maxProfit(int[] prices) {
        int bp = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            bp = Math.min(bp, prices[i]);

            if (bp < prices[i]) {
                int sp = prices[i];
                int aaajkaprofit = sp - bp;
                if (i == prices.length - 1 || prices[i + 1] < prices[i]) {
                    profit += aaajkaprofit;
                    bp = Integer.MAX_VALUE;
                }
            }
        }

        return profit;
    }
}