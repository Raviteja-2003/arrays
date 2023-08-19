class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> ar=new ArrayList<>();
        int low=0;
        int high=0;
        int sum=0;
        if(s==0) {
            ar.add(-1);
            return ar;
        }
        while(high<n){
            sum+=arr[high];
            while(sum>s){
                sum-=arr[low];
                low++;
            }
            if(sum==s){
                ar.add(low+1);
                ar.add(high+1);
                return ar;
            }
            high++;
        }
        ar.add(-1);
        return ar;
    }
}