class Solution {
    public int characterReplacement(String s, int k) {
        int maxlen=0;
        int charfreq[]=new int[26];
        int maxcount=0;
        int left=0;
        int right=0;
        int n=s.length();
        while(right<n){
            charfreq[s.charAt(right)-'A']++;
            maxcount=Math.max(maxcount,charfreq[s.charAt(right)-'A']);
            int replacements=(right-left+1)-maxcount;
            if(replacements>k){
                charfreq[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        
        return maxlen;
    }
}