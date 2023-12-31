class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> ar=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                ar.add(arr[i]);
                max=Math.max(max,arr[i]);
            }
        }
        Collections.reverse(ar);
        return ar;
    }
}