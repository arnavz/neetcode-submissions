class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>();
        int max = 0;
        int start = 0;
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            char current = s.charAt(i);
            if(seen.containsKey(current)){
                start = Math.max(start, seen.get(current)+1);
            }
            seen.put(s.charAt(i), i);
            int curr = i - start + 1;
            max = Math.max(curr, max);
        }
        return max;
    }
}
