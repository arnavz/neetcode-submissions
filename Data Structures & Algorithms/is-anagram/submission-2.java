class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        Map<Character, Integer> seen = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(seen.containsKey(s.charAt(i))){
                int val = seen.get(s.charAt(i));
                seen.put(s.charAt(i),val+1);
            }
            else{
                seen.put(s.charAt(i),1);
            }
            
            
        }
        for(int i=0; i<t.length(); i++){
            if(seen.containsKey(t.charAt(i))){
                if(seen.get(t.charAt(i))==1){
                   seen.remove(t.charAt(i));
                   continue;
                }
                int val1 = seen.get(t.charAt(i));
                seen.put(t.charAt(i), val1-1);
            }
            else{
                seen.remove(t.charAt(i));
            }
            
        }
        if(seen.size()==0)
        return true;
        return false;
    }
}
