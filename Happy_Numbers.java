class Solution {
    public int sum_of_squares(int k){
        int s=0;
        while(k>0){
            int r=k%10;
            s+=r*r;
            k=k/10;
        }
        return s;
    }
    public boolean isHappy(int n) {
        if(n==1) return true;
        HashSet<Integer> hs=new HashSet<>();
        while(n!=1){
            if(!hs.contains(n)){
                hs.add(n);
            }
            else{
                return false;
            }
        
             n=sum_of_squares(n);
        }
        return true;
    }
}