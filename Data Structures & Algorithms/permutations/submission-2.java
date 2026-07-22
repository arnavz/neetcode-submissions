class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    getPermute(0, nums, result);
      return result;  
    }

    public void getPermute(int i, int[] nums, List<List<Integer>> result){
        if(i == nums.length-1){
            result.add(toList(nums));
            return;
        }
        for(int j = i; j < nums.length; j++){
            swap(nums, i, j);
            getPermute(i+1, nums, result);
            swap(nums, i, j);
        }

    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }

    public List<Integer> toList(int[] nums){
        List<Integer> res = new ArrayList<>();
        for(int i : nums)
        res.add(i);
        return res;
    }
}
