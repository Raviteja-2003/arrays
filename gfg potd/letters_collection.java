
class Solution{
    static boolean isSafe(int a,int b,int n,int m){
        return (a>=0 && b>=0 && a<n && b<m);
    }
    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][])
    {
        ArrayList<Integer> ar=new ArrayList<>();
        int dx1[]={-1,-1,-1,0,0,1,1,1};
        int dy1[]={-1,0,1,-1,1,-1,0,1};
        int dx2[]={-2,-2,-2,-2,-2,-1,-1,0,0,1,1,2,2,2,2,2};
        int dy2[]={-2,-1,0,1,2,-2,2,-2,2,-2,2,-2,-1,0,1,2};
        for(int i=0;i<q;i++){
            int sum=0;
            if(queries[i][0]==1){
                for(int j=0;j<8;j++){
                    int a=queries[i][1]+dx1[j];
                    int b=queries[i][2]+dy1[j];
                    if(isSafe(a,b,n,m)){
                        sum+=mat[a][b];
                    }
                }
            }
            else{
                for(int j=0;j<16;j++){
                    int a=queries[i][1]+dx2[j];
                    int b=queries[i][2]+dy2[j];
                    if(isSafe(a,b,n,m)){
                        sum+=mat[a][b];
                    }
                }
                
            }
            ar.add(sum);
        }
        return ar;
    }
}