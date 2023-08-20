class Solution {
    int count(int[] arr, int n, int x) {
      int low=0;
      int high=n-1;
      while(high>=low){
          if(arr[low]==x &&  arr[high]==x){
              return high-low+1;
          }
          if(arr[low]!=x) low++;
          if(arr[high]!=x) high--;
      }
      return 0;
    }
}