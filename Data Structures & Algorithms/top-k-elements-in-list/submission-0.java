class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> seen = new HashMap<>();
        int[] res = new int[k];
        for(int num : nums){
            int count = seen.getOrDefault(num, 0);
            seen.put(num, count+1);
        }
        List< Integer> sorted = seen.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).limit(k)
    .map(Map.Entry::getKey).collect(Collectors.toList());
    for(int i = 0; i<k; i++){
        res[i] = sorted.get(i);
    }
        return res;
    }
}
