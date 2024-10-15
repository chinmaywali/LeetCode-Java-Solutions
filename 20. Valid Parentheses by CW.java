20. Valid Parentheses

import java.util.Stack;
O[ N ]

soltn 1:
class Solution {
    public boolean isValid(String s) {
       Stack<Character> str = new Stack();

        for(char c : s.toCharArray()){

            switch(c){
                case '(':
                case '[':
                case '{':
                    str.push(c);
                    break;

                case ')':
                    if(str.isEmpty() || str.pop() != '(' ){
                        return false;
                    }
                    break;
                case ']':
                    if(str.isEmpty() || str.pop() != '[' ){
                        return false;
                    }
                    break;

                case '}':
                    if(str.isEmpty() || str.pop() != '{' ){
                        return false;
                    }
                    break;
            }
        }
        return str.isEmpty();
    }
}
