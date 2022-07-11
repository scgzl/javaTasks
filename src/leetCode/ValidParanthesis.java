package leetCode;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        /**
         Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
         An input string is valid if:
         Open brackets must be closed by the same type of brackets.
         Open brackets must be closed in the correct order.
         Example 1:
         Input: s = "()"
         Output: true
         Example 2:
         Input: s = "()[]{}"
         Output: true
         Example 3:
         Input: s = "(]"
         Output: false
         */

        System.out.println(isValid("[}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(a == '(' || a == '[' || a == '{') stack.push(a);
            else if(stack.empty()) return false;
            else if(a == ')' && stack.pop() != '(') return false;
            else if(a == ']' && stack.pop() != '[') return false;
            else if(a == '}' && stack.pop() != '{') return false;
        }
        return stack.empty();
    }
}
