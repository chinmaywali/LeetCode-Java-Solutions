27. Remove Element 

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]

[ O(N) ]

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
















