class Pair{
    int element;
    int numMin;
    Pair(int ele,int nm){
        element=ele;
        numMin=nm;
    }
}
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod=1000000007;
        ArrayDeque<Pair> stack1=new ArrayDeque<>();
        ArrayDeque<Pair> stack2=new ArrayDeque<>();
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        //filling left array
        for(int i=0;i<n;i++){
            int count=1;
            while(stack1.size()!=0 && stack1.peek().element>arr[i]){
                count=count+stack1.peek().numMin;
                stack1.pop();
            }
            stack1.push(new Pair(arr[i],count));
            left[i]=count; 
        }
        stack2.clear();
        //filling right array
        for(int i=n-1;i>=0;i--){
            int count=1;
            while(!stack2.isEmpty() && stack2.peek().element>=arr[i]){
                count=count+stack2.peek().numMin;
                stack2.pop();
            }
            stack2.push(new Pair(arr[i],count));
            right[i]=count; 
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=(int)(ans+((long)left[i]*right[i]*arr[i])%mod)%mod;
        
        }
        return ans;
    }
}