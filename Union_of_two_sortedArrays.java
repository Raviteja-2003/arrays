//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> result=new ArrayList<>();
        int i=0,j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(result.size()==0||result.get(k-1)!=arr1[i]){
                result.add(arr1[i]);
                k++;
                }
                i++;
            }
            else{
                if(result.size()==0||result.get(k-1)!=arr2[j]){
                    result.add(arr2[j]);
                    k++;
                }
                j++;
            }
        }
        while(j<m){
            if(result.size()==0||result.get(k-1)!=arr2[j]){
                    result.add(arr2[j]);
                    k++;
                }
                j++;
        }
        while(i<n){
             if(result.size()==0||result.get(k-1)!=arr1[i]){
                result.add(arr1[i]);
                k++;
                }
                i++;
        }
        return result;
        
    }
}
