
class Solution {
    public static int findMinOperation(int N, int[][] matrix) {
        int rows=0;
        int cols=0;
        for(int i=0;i<N;i++){
            int r=0;
            int c=0;
            for(int j=0;j<N;j++){
                r+=matrix[i][j];
                c+=matrix[j][i];
            }
            rows=Math.max(rows,r);
            cols=Math.max(cols,c);
        }
        int maxi=Math.max(rows,cols);
        int res=0;
        for(int i=0;i<N;i++){
            int rs=0;
            for(int j=0;j<N;j++){
                rs+=matrix[i][j];
            }
            res+=(maxi-rs);
        }
        return res;
    }
}
        