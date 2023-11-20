class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        int n=num.length();
        for(int i=0;i<n;i++){
            char ch=num.charAt(i);
            while(!st.isEmpty() && k>0 && ch<st.peek()){
                st.pop();
                k--;
            }
            if(!st.isEmpty() || ch!='0'){
                st.push(ch);
            }
        }
        while(!st.isEmpty() && k-->0){
            st.pop();
        }
        if(st.isEmpty()) return "0";
        String ans="";
        while(!st.isEmpty()){
            ans=st.peek()+ans;
            st.pop();
        }
        return ans;
    }
}