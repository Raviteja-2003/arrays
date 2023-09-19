class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        if(n==0 || n==1) return n;
        int i=1;
        while(n!=0){
            if((n & 1)==1) return i;
            n=n/2;
            i++;
        }
        return 0;
            
    }
}