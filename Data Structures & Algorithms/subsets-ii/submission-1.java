class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
      List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        getAllSubsetNodes(0, nums, list, result);
        return result;  
    }

    public void getAllSubsetNodes(int i, int[] nums, List<Integer> list, List<List<Integer>> res) {
       res.add(new ArrayList(list));
       
        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) {
                continue;
            }
            list.add(nums[j]);
            getAllSubsetNodes(j+1, nums, list, res);
            list.remove(list.size() - 1);
        }

    }
}
