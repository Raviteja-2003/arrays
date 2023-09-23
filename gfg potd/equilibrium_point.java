
class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        if(n==1) return 1;
        long sum=0;
        long lsum=0;
        for(long num:arr){
            sum+=num;
        }
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];
            if(lsum==sum){
                return i+1;
            }
            lsum+=arr[i];
        }
        return -1;
    }
}