49. Group Anagrams

import java.util.*;

// 1. take out string 
// 2.conv to char 
// 3. sort
// 4. back to string
// 5. use hashmap  , check if already present -- then add else create new arraylist and add.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
       Map<String , List<String>> anagramArr = new HashMap<>();
       for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);

            String SortedStr = new String(charArr);

            anagramArr.putIfAbsent(SortedStr , new ArrayList());
            anagramArr.get(SortedStr).add(str);
       }
       return new ArrayList<>(anagramArr.values());
    }
}
