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
[ O(N) ]

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









  

  
