
class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        ArrayList<Integer> ar=new ArrayList<>();
        if(n==1){
           for(int i=0;i<m;i++){
               ar.add(matrix[0][i]);
           }
           return ar;
        }
        if(m==1){
            for(int i=0;i<n;i++){
                ar.add(matrix[i][0]);
            }
            return ar;
        }
        for(int i=0;i<m;i++){
            ar.add(matrix[0][i]);
        }
        for(int i=1;i<n;i++){
            ar.add(matrix[i][m-1]);
        }
        for(int i=m-2;i>=0;i--){
            ar.add(matrix[n-1][i]);
        }
        for(int i=n-2;i>=1;i--){
            ar.add(matrix[i][0]);
        }
        return ar;
    }
}