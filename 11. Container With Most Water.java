11. Container With Most Water

O(N)
  
class Solution {
    public int maxArea(int[] height) {

        int left = 0 ;
        int right = height.length - 1;

        int max = 0 ;

        while(left < right){
            int width = right - left ; 
            int high = height[left] < height[right] ? height[left] : height[right];

            int waterlevel = width * high;

            if(waterlevel > max){
                max = waterlevel;
            }

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return max;
    }
}
