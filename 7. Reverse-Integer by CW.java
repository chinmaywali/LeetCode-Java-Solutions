# 7.Reverse Integer
  O(logN)

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
