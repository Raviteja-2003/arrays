class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        int mod=1000000007;
        if(N==0) return 0;
        if(R==0) return 1;
        long ans=0;
        if(R%2==0){
            ans=power(N,R/2);
            return (ans%mod*ans%mod)%mod;
        }
        else{
            ans=power(N,(R-1)/2);
            return (ans%mod*ans%mod*N%mod)%mod;
        }
    }

}