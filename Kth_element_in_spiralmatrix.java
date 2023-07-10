class Solution
{
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here	
	   int top=0;
	   int left=0;
	   int right=m-1;
	   int bottom=n-1;
	   while(top<=bottom && left<=right){
    	   for(int i=left;i<=right;i++){
    	       k--;
    	       if(k==0){
    	           return A[top][i];
    	       }
    	   }
    	   top++;
    	   for(int i=top;i<=bottom;i++){
    	       k--;
    	       if(k==0){
    	           return A[i][right];
    	       }
    	   }
    	   right--;
    	   if(top<=bottom){
    	   for(int i=right;i>=left;i--){
    	       k--;
    	       if(k==0){
    	           return A[bottom][i];
    	       }
    	   }
    	   bottom--;
    	   }
    	  
    	   if(left<=right){
    	   for(int i=bottom;i>=top;i--){
    	       k--;
    	       if(k==0){
    	           return A[i][left];
    	       }
    	   }
    	   left++;
    	   }
    	   
	   }
	   return -1;
	   
    }
}