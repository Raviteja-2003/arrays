
class Solution {
    public int completeRows(int n) {
       int x=0;
       int i=1;
       int ans=0;
       while(x+i<=n){
           x+=i;
           ans=i;
           i++;
       }
       return ans;
    }
}