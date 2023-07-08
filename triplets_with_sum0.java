class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                sum+=arr[j]+arr[k];
                if(sum==0){
                    return true;
                }
                else if(sum>0){
                    k--;
                    sum=arr[i];
                }
                else{
                    j++;
                    sum=arr[i];
                }
            }
        }
        return false;
    }
}