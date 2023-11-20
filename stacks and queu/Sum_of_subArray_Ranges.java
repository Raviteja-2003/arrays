class Pair{
    int element,occur;
    Pair(int ele,int ocu){
        element=ele;
        occur=ocu;
    }
}
class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        int min_left[]=new int[n];
        int min_right[]=new int[n];
        ArrayDeque<Pair> st=new ArrayDeque<>();
        // finding min occurence
        for(int i=0;i<n;i++){
            int num=nums[i];
            int count=1;
            while(!st.isEmpty() && st.peek().element>=num){
                count=count+st.peek().occur;
                st.pop();
            }
            st.push(new Pair(num,count));
            min_left[i]=count;
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            int num=nums[i];
            int count=1;
            while(!st.isEmpty() && st.peek().element>num){
                count=count+st.peek().occur;
                st.pop();
            }
            st.push(new Pair(num,count));
            min_right[i]=count;
        }
        st.clear();
        //finding maximum occurrence
        int max_left[]=new int[n];
        int max_right[]=new int[n];
        for(int i=0;i<n;i++){
            int num=nums[i];
            int count=1;
            while(!st.isEmpty() && st.peek().element<=num){
                count=count+st.peek().occur;
                st.pop();
            }
            st.push(new Pair(num,count));
            max_left[i]=count;
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            int num=nums[i];
            int count=1;
            while(!st.isEmpty() && st.peek().element<num){
                count=count+st.peek().occur;
                st.pop();
            }
            st.push(new Pair(num,count));
            max_right[i]=count;
        }
        st.clear();
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=((long)(max_left[i]*max_right[i])-(long)(min_left[i]*min_right[i]))*nums[i];
        }
        return sum;
    }
}