class Solution
{
    long solve(String S,int K){
        long ans=0;
        int n=S.length();
        int i=0;
        int j=0;
        int size=0;
        int map[]=new int[26];
        while(j<n){
            char c=S.charAt(j);
            if(map[c-'a']==0){
                size++;
            }
            map[c-'a']++;
            while(size>K){
                char ch=S.charAt(i);
                map[ch-'a']--;
                if(map[ch-'a']==0){
                    size--;
                }
                i++;
            }
            ans=ans+j-i+1;
            j++;
        }
        return ans;
    }
    long substrCount (String S, int K) {
       return solve(S,K)-solve(S,K-1);
    }
}