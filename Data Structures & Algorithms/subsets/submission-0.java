class Solution {
    
    public void solve(int[] nums, int index, List<Integer> list, List<List<Integer>> result){
        
        if(index >= nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        solve(nums, index + 1, list, result);
        list.remove(list.size()-1);
        solve(nums, index + 1, list, result);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        solve(nums, 0, list, result);
        return result;
    }
}
