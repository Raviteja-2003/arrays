public class Solution {
    public int solve(int[] A, int B) {
         HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int xor=0;
        int count=0;
        for(int i=0;i<A.length;i++){
           xor^=A[i];
           int x=xor^B;
           if(hm.containsKey(x)){
               count+=hm.get(x);
           }
           if(hm.containsKey(xor)){
               hm.put(xor,hm.get(xor)+1);
           }
           else{
               hm.put(xor,1);
           }

        }
        return count;
    }
}
