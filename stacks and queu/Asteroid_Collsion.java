
class Solution {
    public boolean sign(int a){
        if(a>0) return true;
        return false;
    }
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if (st.size() == 0 || (st.peek() < 0 && asteroids[i] > 0) || sign(st.peek())==sign(asteroids[i])) {
                st.push(asteroids[i]);
            } else {
                while (st.size() > 0 && st.peek() > 0 && st.peek() < Math.abs(asteroids[i]))
                    st.pop();

                if (st.size() == 0 || st.peek() < 0) {
                    st.push(asteroids[i]);
                } else if (st.peek() == Math.abs(asteroids[i])) {
                    st.pop();
                }
            }
        }
        int res[]=new int[st.size()];
        int k=st.size()-1;
        while(!st.isEmpty()){
            res[k--]=st.pop();
        }
        return res;
    }
} 