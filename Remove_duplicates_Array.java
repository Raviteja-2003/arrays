//User function Template for Java
//two pointer approach
class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        int i=0;
        for(int j=1;j<N;j++){
            if(A[j]!=A[i]){
                A[i+1]=A[j];
                i++;
            }
        }
        return i+1;
    }
}
