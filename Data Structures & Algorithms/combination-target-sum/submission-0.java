class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
         List<List<Integer>> result = new ArrayList<>();
         List<Integer> list = new ArrayList<>();
         solve(target, nums, list, result, 0);
         return result;
    }

    public void solve(int target, int[] candidates, List<Integer> list, List<List<Integer>> result, int index){
        if(target == 0){
            result.add(new ArrayList(list));
            return;
        }
        if(target < 0){
            return;
        }
        if(index == candidates.length){
            return;
        }
        list.add(candidates[index]);
        solve(target - candidates[index], candidates, list, result, index);
        list.remove(list.size()-1);
        solve(target, candidates, list, result, index+1);
    }
}
