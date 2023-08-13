
class Solution {
    public static int minimum_difference(int n, String[] words) {
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            String str1=words[i];
            for(int j=i+1;j<words.length;j++){
                String str2=words[j];
                int sum=0;
                for(int k=0;k<str1.length();k++){
                    char c1=str1.charAt(k);
                    char c2=str2.charAt(k);
                    sum+=Math.abs(c1-c2);
                }
                mini=Math.min(mini,sum);
            }
        }
        return mini;
    }
}