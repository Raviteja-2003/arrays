class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        int maxLen=0;
        int sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxLen=i+1;
            }
            else{
                if(hm.get(sum)!=null){
                    maxLen=maxLen>i-hm.get(sum)?maxLen:i-hm.get(sum);                }
                else{
                    hm.put(sum,i);
                }
            }
        }
        return maxLen;
    }
}