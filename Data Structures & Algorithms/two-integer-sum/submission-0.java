class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j = 0;
        int[] res = new int[2];
        for(int i=1; i < nums.length; i++){
            int val = target - nums[j];
            if(nums[i]== val){
                res[0]=j;
                res[1]=i;
                return res;
            }
            if (i == nums.length - 1) {
                j++;
                i = j;
            }
        }

        return res;
    }
}

