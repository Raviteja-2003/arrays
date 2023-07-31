class Solution {
    public int lengthOfLongestSubstring(String s) {
      int max=0;
      HashMap<Character,Integer> hm=new HashMap<>();
      int left=0;
      int right=0;
      int n=s.length();
      while(right<n){
          if(!hm.containsKey(s.charAt(right))){
              max=Math.max(max,right-left+1);
              hm.put(s.charAt(right),right);
              right++;
          }
          else{
              int val=hm.get(s.charAt(right));
              if(left<=val){
                  left=val+1;   
              }
               hm.put(s.charAt(right),right);
                max=Math.max(max,right-left+1);
               right++;
          }
      }
      return max;
    }
}