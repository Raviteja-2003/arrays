class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)||Character.isDigit(c)) {
                result.append(c);
            }
        }
        String str=result.toString().toLowerCase();
        return pali(0,str.length()-1,str);
    }
    public boolean pali(int low,int high,String s){
         if(low>high) return true;
        if(s.charAt(low)!=s.charAt(high)) return false;
       
        low++;
        high--;
        return pali(low,high,s);
    }
}