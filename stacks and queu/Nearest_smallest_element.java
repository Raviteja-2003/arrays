public class Solution {
    public int[] prevSmaller(int[] A) {
        int res[]=new int[A.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<A.length;i++){
            while(!st.isEmpty() && st.peek()>=A[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(A[i]);
        }
        return res;
    }
}
