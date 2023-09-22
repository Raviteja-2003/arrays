class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> res=new ArrayList<>();
        res.add(-1);
        res.add(-1);
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                if(res.get(0)==-1){
                    res.set(0,i);
                }
                res.set(1,i);
            }
        }
        return res;
    }
}
