class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<S.length();i++){
            if(!hm.containsKey(S.charAt(i))){
                hm.put(S.charAt(i),1);
            }else{
                int val=hm.get(S.charAt(i));
                hm.put(S.charAt(i),val+1);
            }
        }
        for(int i=0;i<S.length();i++){
            if(hm.get(S.charAt(i))==1){
                return S.charAt(i);
            }
        }
        return '$';
    }
}
