public class Solution {
    public static int setBits(int N){
       int p=1;
       int temp=N;
       boolean f=true;
       while(temp!=0){
           if((temp&1)==0){
               f=false;
               break;
           }
           p++;
           temp=temp/2;
       }
       if(f) return N;
       return N+(int)Math.pow(2,p-1);
    }
}
