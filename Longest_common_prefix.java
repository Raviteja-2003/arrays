class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder st=new StringBuilder();
        int n=strs.length;
        String s1=strs[0];
        String s2=strs[n-1];
        int len=s1.length()<s2.length()?s1.length():s2.length();
        for(int i=0;i<len;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                st.append(s1.charAt(i));
            }
            else{
                return st.toString();
            }
        }
        return st.toString();

    }
}