public class Solution {
    public static void insertSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    } 
    public static void insertionSort(int[] arr, int size) {
        insertSort(arr);
    }