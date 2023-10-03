//User function Template for Java

class Solution
{
    String colName (long n)
    {
        StringBuilder sb=new StringBuilder();
        while(n>0){
            n--;
            long val=n%26;
            sb.append((char)('A'+val));
            n=n/26;
        }
        return sb.reverse().toString();
    }
}