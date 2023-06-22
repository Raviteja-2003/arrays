 class Solution {
    void pushZerosToEnd(int[] arr, int n) {
 int j=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }else{
                count++;
            }
        }
        for(int i=0;i<count;i++){
            arr[j]=0;
            j++;
        }
     }
}        
       

//User function Template for Java
//optimised
class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            
        }
else{
    for(int i=j+1;i<n;i++){
        if(arr[i]!=0){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j++;
        }
    }
    
}
       
    }
}        
        
