class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
         Collections.sort(a);
         int low=0;
         int high=m-1;
         long k=Long.MAX_VALUE;
         while(high<n){
             k=Math.min(k,a.get(high)-a.get(low));
             low++;
             high++;
         }
         return k;
    }
}