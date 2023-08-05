class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int nice=0;
        int odd=0;
        int count=0;
        int l=0;
        int r=0;
        while(r<nums.length){
            if(nums[r]%2!=0){
                odd++;
                count=0;
            }
            while(odd==k){
                count++;
                odd-=nums[l++]&1;
            }
            r++;
            nice+=count;
        }
        return nice;
    }
}