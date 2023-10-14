import java.util.*;

public class Solution {
    public static String infixToPostfix(String exp) {
        StringBuilder st = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int[] precedence = new int[128];
        precedence['('] = 4;
        precedence['^'] = 3;
        precedence['/'] = 2;
        precedence['*'] = 2;
        precedence['-'] = 1;
        precedence['+'] = 1;

        int n = exp.length();
        for (int i = 0; i < n; i++) {
            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                st.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    st.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // Pop the '('
                }
            } else {
                while (!stack.isEmpty() && stack.peek() != '(' && precedence[ch] <= precedence[stack.peek()]) {
                    st.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            st.append(stack.pop());
        }
        return st.toString();
    }

    
}