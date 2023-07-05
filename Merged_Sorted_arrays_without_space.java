//optimal approach 1
class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int left = n - 1;
        int right = 0;

        // Swap the elements until arr1[left] is
        // smaller than arr2[right]:
        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }

        // Sort arr1[] and arr2[] individually:
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
//optimal approach 2
class Solution
{
    public static void swapIfGreater(long[] arr1, long[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            long temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int len=n+m;
        int gap=len/2+len%2;
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
                //arr1 and arr2
                if(left<n && right>=n){
                    swapIfGreater(arr1,arr2,left,right-n);
                }
                //arr2
                else if(left>=n){
                    swapIfGreater(arr2,arr2,left-n,right-n);
                }
                //arr1
                else{
                     swapIfGreater(arr1,arr1,left,right);
                    
                }
                left++;right++;
            }
            if(gap==1){
                break;
            }
            else{
                gap=gap/2+gap%2;
            }
        }
    }
}
