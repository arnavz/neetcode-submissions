class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        int j = 0;
        for(int i = 0; i<strs.length; i++){
            // List<String> anagrams = new ArrayList<>()
            if (visited[i]) {
                if(i==strs.length-1 && j < strs.length - 1){
                    i=j;
                    j++;
                }
                continue;
            }
            if(!visited[i] && isAnagram(strs[i], strs[j])){
               List<String> anagrams = map.getOrDefault(strs[j], new ArrayList<>()); 
            //    if(anagrams.size()==0){
            //     anagrams.add(strs[j]);
            //    }
               anagrams.add(strs[i]);
               map.put(strs[j], anagrams);
               visited[i] = true;
            }
            if(i==strs.length-1){
                i=j;
                j++;
            }
            
        }

        // for(String str : strs){
        //     String sortedStr = getSortedStr(str);
        //     List<String> anagrams = map.getOrDefault(sortedStr, new ArrayList<>());
        //     anagrams.add(str);
        //     map.put(sortedStr, anagrams);
        // }
        map.values().forEach(result::add);
        return result;
    }

    // public String getSortedStr(String s){
    //     char[] ch = s.toCharArray();
    //     Arrays.sort(ch);
    //     return new String(ch);
    // }

    public boolean isAnagram(String str1, String str2){
        if (str1.length() != str2.length()) return false;
        Map<Character, Integer> seen = new HashMap<>();
        for(int i = 0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            int count = seen.getOrDefault(ch, 0);
            seen.put(ch, count+1);
        }
        for(int i = 0; i<str2.length(); i++){
            char ch = str2.charAt(i);
            if (seen.containsKey(ch)) {
                int count = seen.get(ch);
            if(count == 1)
                seen.remove(ch);
            else
                seen.put(ch, count-1);
            } else {
                return false;
            }
        }
        if(seen.size() == 0){
            return true;
        }
        return false;
    }

}