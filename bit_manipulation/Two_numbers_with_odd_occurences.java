import java.util.*;
public class Solution {
    public static int[] twoOddNum(int []arr){
        int res[]=new int[2];
        res[0]=0;
        res[1]=0;
        int xor=0;
        for(int num:arr){
            xor^=num;
        }
        int rmsb=xor&(-xor);
        for(int num:arr){
            if((num&rmsb)==0){
                res[0]^=num;
            }
            else{
                res[1]^=num;
            }
        }
        if(res[0]<res[1]){
            int temp=res[0];
            res[0]=res[1];
            res[1]=temp;
        }
        return res;
    }
}