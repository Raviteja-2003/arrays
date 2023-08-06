class Solution
{
    public static int diffSum(int n,int m,int arr[])
    {
        Arrays.sort(arr);
        int sum1=0;
        int sum2=0;
        for(int i=0;i<m;i++){
            sum1+=arr[i];
        }
        for(int i=n-1;i>n-1-m;i--){
            sum2+=arr[i];
        }
        return sum2-sum1;
    }
}