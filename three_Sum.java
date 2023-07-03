//optimized code
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfLists=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    ArrayList<Integer> ar=new ArrayList<>();
                    ar.add(nums[i]);
                    ar.add(nums[j]);
                    ar.add(nums[k]);
                    listOfLists.add(ar);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){j++;}
                    while(j<k && nums[k]==nums[k+1]){k--;}
                    
                }
            }
        }
        return listOfLists;
    }
}
//better approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
               ArrayList<Integer> ar=new ArrayList<>();
               int third=-(nums[i]+nums[j]);
               if(hs.contains(third)){
                  ar.add(nums[i]);
                  ar.add(nums[j]);
                  ar.add(third);
                  Collections.sort(ar);
                  st.add(ar);
               }
               hs.add(nums[j]);
            }
            
        }
        List<List<Integer>> listOfLists = new ArrayList<>(st);
        return listOfLists;
    }
}