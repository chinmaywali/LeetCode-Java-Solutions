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


--------------------------------------------------------------------------------

Optimal solution :

class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums == null || nums.length < 0){
            return 0;
        }
        
        int k = 1; 
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != nums[i-1]){ //0 1 1 2 3
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
