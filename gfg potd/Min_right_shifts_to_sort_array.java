class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        boolean isSorted=true;
         for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                isSorted = false;
                break; 
            }
        }
        if(isSorted) return 0;
        int k=0;
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                k=i+1;
                break;
            }
        }
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=k;i<nums.size();i++){
            ar.add(nums.get(i));
        }
        for(int i=0;i<k;i++){
            ar.add(nums.get(i));
        }
         for (int i = 0; i < ar.size() - 1; i++) {
            if (ar.get(i) > ar.get(i + 1)) {
                return -1; 
            }
        }
        return nums.size()-k;
        
    }
}