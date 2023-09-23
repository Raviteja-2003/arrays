
class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> ar=new ArrayList<>();
        HashSet<Integer> hs=new HashSet();
        HashSet<Integer> dup=new HashSet();
        for(int i=0;i<arr.length;i++){
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
            }
            else{
                if(!dup.contains(arr[i])){
                    dup.add(arr[i]);
                    ar.add(arr[i]);
                }
                
            }
        }
        if(ar.size()==0){
            ar.add(-1);
            return ar;
        }
        Collections.sort(ar);
        return ar;
    }
}
