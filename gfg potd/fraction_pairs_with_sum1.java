
class Solution {
    public static int gcd(int a,int b){
        if(b==0) return a ;
        return gcd(b,a%b);
    }
    public static int countFractions(int n, int[] numerator, int[] denominator) {
       int count=0;
       int k=numerator.length;
       HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
       for(int i=0;i<k;i++){
           int x=numerator[i];
           int y=denominator[i];
           int gcd=gcd(x,y);
           x=x/gcd;
           y=y/gcd;
           int n_x=y-x;
           int n_y=y;
           if(map.containsKey(n_x) && map.get(n_x).containsKey(n_y)){
               count+=map.get(n_x).get(y);
           }
           if(map.containsKey(x)){
               HashMap<Integer,Integer> hm=map.get(x);
               hm.put(y,hm.getOrDefault(y,0)+1);
           }
           else{
               HashMap<Integer,Integer> hm=new HashMap<>();
               hm.put(y,1);
               map.put(x,hm);
           }
       }
       return count;
    }
}
     