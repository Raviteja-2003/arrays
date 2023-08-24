public class Solution {
   
    public static int[] reverseArray(int n, int []nums) {
        return reverse(0,n-1,nums);
    }
    public static int[] reverse(int low,int high,int []nums){
        if(low>=high) return nums;
        int temp=nums[low];
        nums[low]=nums[high];
        nums[high]=temp;
        low++;
        high--;
        return reverse(low,high,nums);
    }
}