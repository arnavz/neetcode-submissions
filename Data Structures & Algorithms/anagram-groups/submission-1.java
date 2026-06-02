class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(String str : strs){
            String sortedStr = getSortedStr(str);
            List<String> anagrams = map.getOrDefault(sortedStr, new ArrayList<>());
            anagrams.add(str);
            map.put(sortedStr, anagrams);
        }
        map.values().forEach(result::add);
        return result;
    }

    public String getSortedStr(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

}
