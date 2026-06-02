class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        Map<Character, Integer> seen = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            int val = seen.getOrDefault(s.charAt(i), 0);
            seen.put(s.charAt(i),val+1);
        }
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            if (seen.containsKey(c)) {
                int count = seen.get(c);
                if (count == 1) {
                    seen.remove(c);
                } else {
                    seen.put(c, count - 1);
                }
            }
        }
        if(seen.size()==0)
        return true;
        return false;
    }
}
