class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int n=cardPoints.length;
       int sum=0;
       int cursum=0;
       int res=0;
       for(int i:cardPoints){
           sum+=i;
       }
       if(n==k) return sum;
       int window=0;
       for(int i=0;i<n-k-1;i++){
           window+=cardPoints[i];
       }
       for(int i=n-k-1;i<n;i++){
           window+=cardPoints[i];
           res=Math.max(res,sum-window);
           window-=cardPoints[i-(n-k-1)];
       }
       return res;
    }
}