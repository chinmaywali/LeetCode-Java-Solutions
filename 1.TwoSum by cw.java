----------
# Two Sum 
----------

Soltn1. Brute Force 

class Solution {
    int sum = 0;
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;i++){
            sum =  nums[i] + nums[j];
            if (sum == target){
                return new int[]{i,j};
            }
         }
      }
    return null;
    }
}

---------------------------------------------------------------------------------------
Solution 2. HashMap

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> hmap = new HashMap<>(); // O(n)

        for(int i = 0 ; i < nums.length ; i++ ){
            hmap.put(nums[i] ,i );
        }

        for(int i = 0 ; i < nums.length ; i++){
            int compliment = target - nums[i];
            if(hmap.containsKey(compliment) && hmap.get(compliment) != i){
                return new int [] { i , hmap.get(compliment) };
            }
        }
        return null;
    }
}
