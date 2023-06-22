class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
       int temp[]=new int[n-k];
       
       for(int i=0;i<n-k;i++){
           temp[i]=nums[i];
       }
       int j=0;
       for(int i=n-k;i<n;i++){
           nums[j]=nums[i];
            j++;
       }
       for(int i=0;i<temp.length;i++){
           nums[j]=temp[i];
           j++;
       }
    }
}
