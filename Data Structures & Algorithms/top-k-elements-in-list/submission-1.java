class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> seen = new HashMap<>();
        int[] res = new int[k];
        for(int num : nums){
            int count = seen.getOrDefault(num, 0);
            seen.put(num, count+1);
        }
        return seen.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).limit(k)
    .mapToInt(Map.Entry::getKey).toArray();
        
        // return res;
    }
}
