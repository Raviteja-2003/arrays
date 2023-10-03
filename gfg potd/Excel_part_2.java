class Solution {
    public int excelColumnNumber(String s) {
        int n=s.length()-1;
        int res=0;
        for(int i=n;i>=0;i--){
            int temp=1;
            for(int j=0;j<(n-i);j++){
                temp=temp*26;
            }
            res=res+temp*(((int) s.charAt(i))-64);
        }
        return res;
    }
}