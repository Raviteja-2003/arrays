class Solution {
    public static List<Integer> generaterow(int n){
        ArrayList<Integer> ar=new ArrayList<>();
        int res=1;
        ar.add(res);
        for(int i=1;i<n;i++){
            res=res*(n-i);
            res=res/i;
            ar.add(res);
        }
        return ar;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li=new ArrayList<>();
         for(int i=1;i<=numRows;i++){
                li.add(generaterow(i));
         }
         return li;
    }
}