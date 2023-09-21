public class Solution {
    public static int getXOR(int N){
        if(N%4==0){
            return N;
        }
        else if(N%4==1){
            return 1;
        }
        else if(N%4==2){
            return N+1;
        }
        else{
            return 0;
        }
    }
    public static int findXOR(int L, int R){
       int xorToR=getXOR(R);
       int xorToLminusone=getXOR(L-1);
       return xorToR^xorToLminusone;
    }
}
