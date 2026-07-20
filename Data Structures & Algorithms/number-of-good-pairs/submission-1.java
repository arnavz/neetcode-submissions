class Solution {
    public int numIdenticalPairs(int[] nums) {
        int len = nums.length;
        int count = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
                freq.put(num, freq.getOrDefault(num,0)+1);
            }
        for(int f : freq.values()){
            if(f>1){
                count = count + f*(f-1)/2;
            }
        }
        
        return count;
    }
}