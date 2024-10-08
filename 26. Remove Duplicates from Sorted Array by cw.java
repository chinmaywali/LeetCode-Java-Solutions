26. Remove Duplicates from Sorted Array

solution1.
[ O(N) ]
  
class Solution {
    public int removeDuplicates(int[] nums) {
      Set<Integer> s = new LinkedHashSet<>();

      for(int i : nums){
        s.add(i);
      }

      int index = 0;
      for(int i: s){
        nums[index++] = i;
      }
      return s.size();
    }
}
