class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int pre[]=new int[n];
        int suf[]=new int[n];
        int res=0;
        int maxi=height[0];
        int maxi2=height[n-1];
        for(int i=0;i<height.length-1;i++){
            maxi=Math.max(maxi,height[i]);
            pre[i]=maxi;
        }
        for(int i=n-1;i>=0;i--){
            maxi2=Math.max(maxi2,height[i]);
            suf[i]=maxi2;
        }
        for(int i=1;i<n-1;i++){
            int temp=Math.min(pre[i-1],suf[i+1]);
            res+=Math.max(0,temp-height[i]);
        }
        return res;
    }
}