import java.util.*; 
class Solution {
    public String minRemoveToMakeValid(String s) {
        //Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();  
        int balance = 0; 
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                balance++; 
                //stack.push('('); 
                result.append('('); 
            } else if (ch == ')') {
                if (balance > 0) {
                    balance--; 
                    //stack.pop(); 
                    result.append(')'); 
                } 
            } else {
                result.append(ch); 
            }
        }
        StringBuilder rs = new StringBuilder(); 
        for (int i=result.length() -1; i>=0; i--) {
            char c = result.charAt(i); 
            if (c == '(' && balance-- >0) {
                continue; 
            }
            rs.append(c); 
        }
        return rs.reverse().toString(); 
    }
}