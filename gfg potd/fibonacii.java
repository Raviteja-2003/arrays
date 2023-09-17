
class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        long res[]=new long[n];
        res[0]=1;
        if(n==1) return res;
        res[1]=1;
        int i=2;
        while(n>i){
            res[i]=res[i-1]+res[i-2];
            i++;
        }
        return res;
    }
}