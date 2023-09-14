class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
       int i=0;
       long sum=0;
       long maxi=Integer.MIN_VALUE;
       while(i<arr.length){
           sum+=arr[i];
           maxi=Math.max(maxi,sum);
           if(sum<0){
               sum=0;
           }
          
           i++;
       }
       return maxi;
    }
    
}