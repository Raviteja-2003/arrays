class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int n=str.length();
        StringBuilder rev=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }
}