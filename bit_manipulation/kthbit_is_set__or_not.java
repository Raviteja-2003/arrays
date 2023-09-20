public class Solution {
    static boolean isKthBitSet(int n, int k) {
        int j=1;
        while(n!=0){
            if((n&1)==1 && j==k) return true;
            n=n>>1;
            j++;
        }
        return false;
    }
}