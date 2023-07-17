class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        StringBuilder ans=new StringBuilder();
        int arr[]=new int[26];
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            arr[ch-'a']++;
            q.add(ch);
            while(!q.isEmpty()){
                if(arr[q.peek()-'a']==1){
                    ans.append(q.peek());
                    break;
                }
                else{
                    q.poll();
                }
            }
            if(q.isEmpty()){
                ans.append("#");
            }
        }
        return ans.toString();
    }
}