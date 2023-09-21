public class Solution{
    public static int missingNumber(int n, int []arr){
        int result=0;
        for(int i=0;i<n;i++){
            result=result^arr[i];
        }
        return result;
    }
}