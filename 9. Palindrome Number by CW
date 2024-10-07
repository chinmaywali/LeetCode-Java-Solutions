# 9. Palindrome Number

solution 1.  [ 0(log n) ]

class Solution{
  public boolean isPalindrome(int x){

  if(x<0 || (x%10 == 0 && x!= 0)){
    return false;
  }

  String s = Integer.toString(x);
  String rev = new StringBuilder(s).reverse().toString();
  return s.equals(rev);
  }
}

---------------------------------------------
Solution2. [ 0(log n) ]

class Solution{
  public boolean isPalindrome(int x){

  if(x<0 || (x%10 == 0 && x!= 0)){
    return false;
  }
   int temp = x;
   int rev = 0;

   while(temp>0){
    int m = temp % 10;
    rev = rev * 10 + m;
    temp = temp / 10;
    }
    if(x == rev){
      return true;
    }
    else{
      return false;
    }
  }
}


---------------------------------------------
Solution3.

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10; 
            x /= 10;                 
        }
        return x == rev || x == rev / 10;
    }
}


