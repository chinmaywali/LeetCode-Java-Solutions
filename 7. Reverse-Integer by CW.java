# 7.Reverse Integer
  Solution-1.
  [ O(logN) ]

class Solution{
  public int reverse(int x){
  boolean isNegative = x<0;
  x = Math.abs(x);
    
  String rev = new StringBuilder(Integer.toString(x)).reverse().toString();

 try{
      int result = Integer.parseInt(rev);
      return isNegative? -result : result;
  }
 catch(Exception e){
    return 0;
    }
  }
}

---------------------------------------------------------------------

Solution-2.
[ O(LogX) ]

class Solution{
  public int reverse(int x){

    long rev = 0;
    int mod = 0;

    while(x!=0){
      mod = x % 10;
      rev = rev * 10 + mod;
      x/= 10;
    }

    if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
      return 0;
    }
    return (int) rev;
  }
}



-----------------------------------------------------
  
Solution-3.
class Solution {
    public int reverse(int x) {
        int rev = 0;

        //condition : -2^(31) <= x <= 2^(31 - 1)
        //Minimum Value: Integer.MIN_VALUE = -2,147,483,648
        //Maximum Value: Integer.MAX_VALUE = 2,147,483,647

        while (x != 0) {
            int mod = x % 10;

            // rev number can increse and cross limit of max ..
            // and we mulitify by 10 so check /10  and for max last digit is 7 so % > 7 as +mod to rev
            if(rev > Integer.MAX_VALUE / 10 || ( rev == Integer.MAX_VALUE && mod > 7)){
                return 0;
            }

            // rev number can increse and cross limit of min ..
            // and we mulitify by 10 so check /10  and for min last digit is -8 so % < -8 as +mod to rev
            if(rev < Integer.MIN_VALUE / 10 || ( rev == Integer.MIN_VALUE && mod < -8)){
                return 0;
            }

            rev = rev * 10 + mod;
            x = x / 10;
        }

        return rev;
    }
}






  

  
