class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        int maxlen=0;
        int left=0,right=0,sum=0;
        while(right<N){
            while(left<=right && sum>K){
                sum-=A[left];
                left++;
            }
            if(sum==K){
                maxlen=maxlen>(right-left+1)?maxlen:(right-left+1);
            }
            
            if(right<N){
                sum+=A[right];
            }
            right++;
        }
        return maxlen;
    }
    
    
}

