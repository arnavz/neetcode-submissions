class Solution {
    public void solve(int[] candidates, int target, int index, List<Integer> list, List<List<Integer>> result){
       if(target < 0){
                return;
            }
        if(index >= candidates.length){
            if(target == 0){
                result.add(new ArrayList<>(list));
            }
            return;
        }

        list.add(candidates[index]);
        solve(candidates, target-candidates[index], index + 1, list, result);
        list.remove(list.size()-1);
        while(index + 1 < candidates.length && candidates[index]== candidates[index+1])
        index++;
        solve(candidates, target, index + 1, list, result);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, target, 0, list, result);
        return result;
    }
}
