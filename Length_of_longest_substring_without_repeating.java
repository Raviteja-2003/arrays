class Solution{
    int longestUniqueSubsttr(String S){
      HashMap<Character,Integer> hm=new HashMap<>();
      int maxi=1;
      int n=S.length();
      int left=0;
      int right=0;
      while(right<n){
          char ch=S.charAt(right);
          if(hm.containsKey(ch)){
            int val=hm.get(ch);
              if(left<=val){
                  left=val+1;
              }
          }
          hm.put(ch,right);
          maxi=Math.max(maxi,right-left+1);
          right++;
      }
      return maxi;
    }
}