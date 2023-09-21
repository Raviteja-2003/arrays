public class Solution {
    public static int flipBits(int A, int B){
        int count=0;
        while(A!=0 || B!=0){
            if((A&1)!=(B&1)){
                count++;
            }
            A=A>>1;
            B=B>>1;
        }
        return count++;
    }
}