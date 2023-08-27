class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int d1=0;
        int d2=0;
        int n=moves.length();
        for(int i=0;i<n;i++){
            if(moves.charAt(i)=='L'||moves.charAt(i)=='_'){
                d1--;
            }
            else{
                d1++;
            }
            if(moves.charAt(i)=='R'||moves.charAt(i)=='_'){
                d2++;
            }
            else{
                d2--;
            }
        }
        d1=Math.abs(d1);
        d2=Math.abs(d2);
                
        return Math.max(d1,d2);
    }
}