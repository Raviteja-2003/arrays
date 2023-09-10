public class Solution {
    public static void bubSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=0;j<arr.length-(i+1);j++){
                if(arr[j]>arr[j+1]){
                    flag=false;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            } 
            if(flag) break;
        }
    }
    public static void bubbleSort(int[] arr, int n) {
        bubSort(arr);
    }

}