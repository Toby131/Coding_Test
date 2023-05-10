import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<String> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.substring(i,i+1).charAt(0) == '(')
                stack.push("(");
            else{
                if(stack.empty()) return false;
                else stack.pop();
            }
        }

        if(!stack.empty())
            return false;
        return answer;
    }
}
