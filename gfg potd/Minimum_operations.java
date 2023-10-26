//User function Template for Java


class Solution
{
    public int minOperation(int n)
    {
        int oper=0;
        int number=0;
        while(n>1){
            number=n%2;
            if(number!=0){
                oper++;
            }
            n=n/2;
            oper++;
        }
        return oper+1;
    }
}