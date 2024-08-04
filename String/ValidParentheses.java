package String;
import java.util.Deque;
import java.util.ArrayDeque;


public class ValidParentheses {
    class Solution {
    
        public boolean isValid(String s) {
            Deque<Character> stack = new ArrayDeque<>();
            for(char ch : s.toCharArray()) {
                if(ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else {
                    char chp = '.';
                    switch(ch) {
                        case ')': chp = '('; break;
                        case ']': chp = '['; break;
                        case '}': chp = '{'; break;
                    }
                    
                    if(stack.isEmpty() || !stack.pop().equals(chp)) return false;
                }
            }
            
            return stack.isEmpty();
        }
    } 
}
