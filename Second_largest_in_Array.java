//Secondlargest element
class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int max=arr[0];
        int smax=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else{
                if(arr[i]!=max && arr[i]>smax){
                    smax=arr[i];
                }
            }
        }
        return smax;
    }
}
