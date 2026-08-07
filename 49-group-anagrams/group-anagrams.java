import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int count[] = new int[26];
            for(char ch: str.toCharArray()){
                count[ch-'a']++;
            }
            
           String key = Arrays.toString(count);
            // char[] chars = str.toCharArray();

            // Arrays.sort(chars);

            // String key = new String(chars);


            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}