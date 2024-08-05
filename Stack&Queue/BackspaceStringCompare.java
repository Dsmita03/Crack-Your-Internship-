import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>stacks=new Stack<>();
          Stack<Character>stackt=new Stack<>();
          for(char val:s.toCharArray()){
           if(val!='#')
           stacks.push(val);
           else  if(val=='#'&&!stacks.isEmpty())
           stacks.pop();
          }
           for(char val:t.toCharArray()){
           if(val!='#')
           stackt.push(val);
           else  if(val=='#'&&!stackt.isEmpty())
           stackt.pop();
          }
          while(!stacks.isEmpty()&&!stackt.isEmpty()){
           
                if(stacks.pop()!=stackt.pop())return false;

          }
          
          return stacks.isEmpty()&&stackt.isEmpty();
    }
}