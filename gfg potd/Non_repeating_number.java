class Solution
{
    public int[] singleNumber(int[] nums)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int res[]=new int[2];
        int k=0;
        for(int x:hm.keySet()){
            if(hm.get(x)%2!=0){
                res[k++]=x;
            }
        }
        if(res[0]>res[1]){
            int temp=res[0];
            res[0]=res[1];
            res[1]=temp;
        }
        return res;
    }
}