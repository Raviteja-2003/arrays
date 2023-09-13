class Solution {
    static int isPerfectNumber(long N) {
        long sum=1;
        for(long i=2;i*i<N;i++){
            if(N%i==0){
                sum=sum+i;
                if(i!=N/i){
                sum=sum+N/i;
                }
            }
        }
        if(sum==N && N!=1) return 1;
        return 0;
    }
};