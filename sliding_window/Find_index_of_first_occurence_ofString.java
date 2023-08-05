class Solution {
    public int strStr(String haystack, String needle) {
      int i=0;
      int j=needle.length();
      int n=haystack.length();
      while(j<=n){
          if(needle.equals(haystack.substring(i,j))){
              return i;
          }
          i++;
          j++;
      }
      return -1;
    }
}