class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        for(int num: nums){
            visited.add(num);
        }
        List<Integer> possibleStarts = new ArrayList<>();
        for(int num : nums){
            if(!visited.contains(num-1)){
                possibleStarts.add(num);
            }
        }
        int maxCount = 0;
        for(int start : possibleStarts){
            int count = 1;
            int current = start;
            while(true){  
            if(visited.contains(current+1)){
                count++;
                current = current + 1;
            }else{
                maxCount = Math.max(count, maxCount);
                break;
            }
            }
            
        }
        return maxCount;
    }
}
