
// Time Complexity: O(n) - Traverse through the array only once.
// Space Complexity: O(1) - We are using only two variables.
public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {3,6,4,9,1,4,7};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices){
        int buyPrice = prices[0];
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            } else {
                int currentProfit = prices[i] - buyPrice;
                profit = Math.max(currentProfit, profit);
            }
        }
        return profit;
    }
}


