class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int left=0;
        int right=n-1;
        int i=n-1;
        while(i>=0){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                res[i--]=nums[left]*nums[left];
                left++;
            }
            else{
                res[i--]=nums[right]*nums[right];
                right--;
            }
        }
        return res;
    }
}