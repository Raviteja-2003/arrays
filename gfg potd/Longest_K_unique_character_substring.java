class Solution {
    public int longestkSubstr(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int low=0;
        int high=0;
        int n=s.length();
        int max=-1;
        while(high<n){
            char currentChar = s.charAt(high);
            int currentValue = hm.getOrDefault(currentChar, 0);
            hm.put(currentChar, currentValue + 1);
            if(hm.size()==k){
                max=Math.max(max,high-low+1);
            }
            while(hm.size()>k){
                int val=hm.get(s.charAt(low));
                if (val > 1) {
                hm.put(s.charAt(low), val - 1);
                }else if (val == 1) {
                    hm.remove(s.charAt(low));
                }
                low++;
            }
            high++;
        }
        return max;
    }
}