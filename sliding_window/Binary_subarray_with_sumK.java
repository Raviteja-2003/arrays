class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       int count=0;
       int n=nums.length;
       HashMap<Integer,Integer> hm=new HashMap<>();
       hm.put(0,1);
       int sum=0;
       for(int i=0;i<n;i++){
           sum+=nums[i];
           if(hm.containsKey(sum-goal)){
               count=count+hm.get(sum-goal);
           }
           hm.put(sum,hm.getOrDefault(sum,0)+1);
       }
       return count;
    }
}