class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb=new StringBuilder();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==')') stack.pop();
            if(!stack.isEmpty()){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i)=='('){
                stack.push('(');
            }
           
        }
        return sb.toString();
    }
}