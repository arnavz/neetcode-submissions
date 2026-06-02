class Solution {
    public int[] productExceptSelf(int[] nums) {
      int len = nums.length;
      int[] output = new int[len];
      int suffix = 1;
      output[0]=1;
      for(int i = 1; i<len; i++){
        output[i] = nums[i-1]*output[i-1];
      }  
      for(int i = 0; i<len; i++){
        System.out.println(output[i]);
      }
      for(int i = len-1; i>=0; i--){
        output[i] = output[i]*suffix;
        System.out.println("output[i] --> " + output[i]);
        suffix = suffix * nums[i];
        System.out.println("suffix --> " + suffix);
      }
      for(int i = 0; i<len; i++){
        System.out.println(output[i]);
      }
      return output;
    }
}  
