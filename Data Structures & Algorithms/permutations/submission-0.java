class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        Map<Integer, Boolean> visited = new HashMap<>();
        for(int i : nums)
        visited.put(i, false);
        getPermuteItems(nums, visited, arr, result);
        return result;
    }

    public List<List<Integer>> getPermuteItems(int[] nums, Map<Integer, Boolean> visited, List<Integer> arr, List<List<Integer>> result){
        if(arr.size() == nums.length){
            result.add(new ArrayList<>(arr));
            return result;
        }
        for(int i = 0; i < nums.length; i++){
            if(!visited.get(nums[i])){
                arr.add(nums[i]);
                visited.put(nums[i], true);
                getPermuteItems(nums, visited, arr, result);
                visited.put(nums[i], false);
                arr.remove(arr.size() - 1);
            }
            
        }
        return result;
    }
}
