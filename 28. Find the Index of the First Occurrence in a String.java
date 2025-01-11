28. Find the Index of the First Occurrence in a String

Slinding Window tech

  
  class Solution {
    public int strStr(String haystack, String needle) {
        //sadbutsad    sad

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        //Sliding Window : i=0 ,  (i , i + needleLength) (0,5) | i = 1 , (1,6) etc..
        for(int i = 0 ; i <= haystackLength - needleLength ; i++){
            if(haystack.substring(i , i + needleLength ).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
