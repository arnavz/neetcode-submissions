class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int low = Integer.MIN_VALUE;
       int high = 0;
        for(int weight : weights){
            low = Math.max(low, weight);
            high+= weight;
        }

        while(low < high){
            int mid = low + (high - low)/2;
            if(canShip(weights, mid, days)){
                high = mid;
            }else{
                low = mid + 1;
            }

        }
        return low;
    }

    private boolean canShip(int[] weights, int capacity, int days){
        int numOfDays = 1;
        int sum = 0;
        for(int weight : weights){
            
            if(sum + weight > capacity){
                numOfDays++;
                sum = 0;
            }
                sum+= weight;
            
             
        }
        return numOfDays <= days;

    }
}