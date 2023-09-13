class Solution{
    static String findLargest(int N, int S){
        if(S>9*N || S==0 && N>1) return "-1";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<N;i++){
            int digit=Math.min(9,S);
            sb.append(digit);
            S=S-digit;
        }
        return sb.toString();
    }
}