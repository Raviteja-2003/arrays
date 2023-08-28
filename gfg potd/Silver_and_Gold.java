class Solution {
    public String flipCoins(int N,String s) {
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]=='0'){
                arr[i]='1';
                if(arr[i+1]=='0'){
                    arr[i+1]='1';
                }
                else{
                    arr[i+1]='0';
                }
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='0'){
                count=1;
                break;
            }
        }
        return count==0?"Yes":"No";
    }
}