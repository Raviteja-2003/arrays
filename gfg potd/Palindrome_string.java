class Solution {
    int isPalindrome(String S) {
        int low=0;
        int high=S.length()-1;
        while(high>=low){
            if(S.charAt(low)!=S.charAt(high)) return 0;
            low++;
            high--;
        }
        return 1;
    }
};