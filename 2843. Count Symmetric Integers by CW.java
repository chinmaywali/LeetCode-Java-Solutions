# Count Symmetric Integers

    [ O(n*m) ]

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for(int num=low;num<=high;num++){
            
            String S = String.valueOf(num); //Convert number to string
            int len = S.length();
            
            if(len%2 == 0){
                int sum1 = 0;
                int sum2 = 0;
                
                for(int i=0;i<len/2;i++){                // Character.getNumericValue(...) - This static method converts a character that represents a digit (like '0', '1', etc.) into its corresponding integer value. 
                                                         //If you pass '1' to Character.getNumericValue, it returns 1.
                    sum1 = sum1 + Character.getNumericValue(S.charAt(i)); //S.charAt(i) - This method retrieves the character 
                                                                          // at index i from the StringBuilder object numStr.
                    sum2 = sum2 + Character.getNumericValue(S.charAt( len - 1 - i));
                }
                if(sum1 == sum2){
                    count++;
                }
            }
        }
        return count;
    }   
}
