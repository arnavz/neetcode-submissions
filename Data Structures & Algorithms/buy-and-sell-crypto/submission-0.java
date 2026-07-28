class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int bought = prices[0];
        int maxProfit = 0;
        for(int i : prices){
            if(i>bought){
                if((i - bought)>profit){
                    profit = i - bought;
                }else
                    continue;
            }else
            bought = i;
        }
        return profit;
    }
}
