class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int val=hm.get(arr[i]);
                hm.put(arr[i],val+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        int temp=hm.get(arr[0]);
        Collection<Integer> values = hm.values();
        for (Integer value : values) {
            if(hs.contains(value)){
                return false;
            }
            hs.add(value);
        }
        return true;
        
    }
}