class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> m=new ArrayList<>();
        int len=nums.length;
        for(int i=0;i<(1<<len);i++){
            ArrayList<Integer> ar=new ArrayList<>();
            for(int j=0;j<len;j++){
                if((i&(1<<j))!=0){
                    ar.add(nums[j]);
                }
            }
            m.add(ar);
        }
        return m;
    }
}