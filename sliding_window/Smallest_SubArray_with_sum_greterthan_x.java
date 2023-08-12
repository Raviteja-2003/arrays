class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        int sum=0;
        int left=0;
        int right=0;
        int mini=Integer.MAX_VALUE;
        while(right<n){
            sum+=a[right];
              while(sum>x){
                mini=Math.min(mini,right-left+1);
                sum=sum-a[left];
                left++;
            }
            right++;
        }
        if (mini!=Integer.MAX_VALUE) return mini;
         return 0;
    }
}
