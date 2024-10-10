14.Longest Common Prefix 

  // ex: Input: strs = ["flower","flow","flight"] ---> after sorting  -- > [ "flight","flow","flower"] --> compare "flight" and "flower" 
  //      o/p : "fl"

   [ O(N LOG N) ]

class Solution {
    public String longestCommonPrefix(String[] strs) {
      Arrays.sort(strs);
      StringBuilder arr = new StringBuilder;  // TO MAKE CHANGES IN THE ARRAY LATER .. USE DYNAMIC ARRAY 

      String f = strs[0];
      String l = strs[strs.length-1];

      int fl = f.length();
      int ll = l.length();

      int sl =  fl < ll ? fl : ll;
      for(int i=0;i<sl;i++){
        if(f.charAt(i) != l.charAt(i)){
          return arr.toSting();
        }
        arr.append(f.charAt(i));
      }
      return arr.toString();
    }
}


