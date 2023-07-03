//optimised solution

class Sol
{
    public static int search(int A[], int N)
    {
     int xor=0;
     for(int i=0;i<N;i++){
         xor=xor^A[i];
     }
     return xor;
    }
}

//better solution
import java.util.HashMap;
import java.util.Collection;
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
            else{
                hm.put(nums[i],2);
            }
        }
          for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue().equals(1)) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
