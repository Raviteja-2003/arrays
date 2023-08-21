class Solution
{
    public int  Count(int[][] matrix)
    {
        int dx[]={-1,-1,-1,0,0,0,1,1,1};
        int dy[]={-1,0,1,-1,0,1,-1,0,1}; 
        int n=matrix.length;
        int m=matrix[0].length;
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==1){
                int cnt=0;
                for(int x=0;x<9;x++){
                    int nx=i+dx[x];
                    int ny=j+dy[x];
                    if(nx>=0 && nx<n && ny>=0 && ny<m){
                        if(matrix[nx][ny]==0) cnt++;
                    }
                }
                if(cnt>0 && cnt%2==0){
                    res++;
                }
                }
            }
        }
        return res;
    }
}