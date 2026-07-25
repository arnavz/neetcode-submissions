class Solution {
    public int maxSubArray(int[] nums) {
      int currentSum = nums[0];
      int maxSum = nums[0];
      int len = nums.length-1;
      for(int i = 1; i <= len; i++){
        currentSum = Math.max(nums[i], currentSum + nums[i]);
        maxSum = Math.max(currentSum, maxSum);
      }  
      return maxSum;
    }
}