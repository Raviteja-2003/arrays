
class Solution{
    static long largestPrimeFactor(int N) {
      int n=2;
      while(n*n<=N){
          if(N%n==0) N=N/n;
          else n++;
      }
      return N;
    }
}