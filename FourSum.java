class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        // code here
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1;
                int l=n-1;
                while(k<l){
                        long sum=nums[i]+nums[j]+nums[k]+nums[l];
                        if(sum<target){
                            k++;
                        }
                        else if(sum==target){
                            ArrayList<Integer> ar=new ArrayList<>();
                            ar.add(nums[i]);
                            ar.add(nums[j]);
                            ar.add(nums[k]);
                            ar.add(nums[l]);
                            arr.add(ar);
                            k++;
                            l--;
                            while(k<l && nums[k]==nums[k-1]){k++;}
                            while(k<l &&nums[l]==nums[l+1]){l--;}
                        }
                        else {
                            l--;
                        }
                }
            }
        }
        return arr;
    }
}