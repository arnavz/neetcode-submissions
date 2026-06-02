class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            //if(nums[i]>0)
              //  break;
            if(i>0 && nums[i-1]==nums[i])
                continue;
            int target = -nums[i];
            int lo = i+1, hi = nums.length-1;
            while(lo<hi){
                if(nums[lo]+nums[hi]==target){
                    res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                     lo++;
                     hi--;
                    while(lo<hi && nums[lo-1]==nums[lo])
                        lo++;
                    while(lo<hi && nums[hi+1]==nums[hi])
                        hi--;
                   
                }
                else if(nums[lo]+nums[hi]>target)
                    hi--;
                else
                    lo++;
                
            }
        }
        return res;
        
    }
}
