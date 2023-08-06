
class Solution {
    public int sumofdigits(int a){
        int sum=0;
        while(a>0){
            int r2=a%10;
            a=a/10;
            sum+=r2*r2;
        }
        return sum;
    }
    public boolean beautifulNumber(int n) {
      HashSet<Integer> hs=new HashSet<>();
      while(n!=1){
          n=sumofdigits(n);
          if(hs.contains(n)){
              return false;
          }else{
              hs.add(n);
          }
      }
      return true;
    }
}