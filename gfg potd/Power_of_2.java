class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
       if(n==0) return false;
        while(n>1){
            if(n%2==0){
                n=n/2;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
    
}
//optimal
class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
      if(n>0 && (n&(n-1))==0) return true;
      return false;
    }
    
}