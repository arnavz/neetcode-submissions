class Solution {
    public int coinChange(int[] coins, int amount) {
        int res = getMin(coins, amount, 0);
        if(res != Integer.MAX_VALUE)
        return res;
        return -1;
    }
    public int getMin(int[] coins, int amount, int index){
        if(amount == 0){
            return 0;
        }
        if(amount < 0 || index >= coins.length){
            return Integer.MAX_VALUE;
        }
        // int mini = Integer.MAX_VALUE;
        //include
        int include = getMin(coins, amount - coins[index], index);
        if(include != Integer.MAX_VALUE){
            include = 1+include;
        }
        //exclude
        int exclude = getMin(coins, amount, index + 1);
        return Math.min(include, exclude);
    }
}
