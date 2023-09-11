public class Solution {
    public static void merge(int arr[],int low,int high,int mid){
        int temp[]=new int[arr.length];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=high){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(int a=low;a<=high;a++){
            arr[a]=temp[a-low];
        }
    }

    public static void mergeSort(int[] arr, int l, int r){
       if(l<r){
           int mid=(l+r)/2;
           mergeSort(arr, l, mid);
           mergeSort(arr, mid+1, r);
           merge(arr,l,r,mid);

       }
       
    }
}
