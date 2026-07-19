class Solution {

      public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];
        int prefix = 1;
        for(int i = 0; i<len; i++){
            answer[i] = prefix;
            prefix = prefix*nums[i];
        }
        int suffix = 1;
        for(int j = len-1; j>=0; j--){
            answer[j] = answer[j]*suffix;
            suffix *= nums[j];
        }
        return answer;
    }
}  
