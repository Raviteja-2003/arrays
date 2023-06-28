class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> hm=new HashMap<>();
       int presum=0;
       int count=0;
       hm.put(presum,1);
       for(int i=0;i<nums.length;i++){
           presum+=nums[i];
          if (hm.containsKey(presum - k)) {
                count += hm.get(presum - k);
            }
            
            hm.put(presum, hm.getOrDefault(presum, 0) + 1);
       }
       return count;
    }
}
