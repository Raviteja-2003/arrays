class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Deque<Character> s=new LinkedList<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='[' ||x.charAt(i)=='(' ||x.charAt(i)=='{'  ){
                s.push(x.charAt(i));
            }
            else{
                if(x.charAt(i)==']'){
                    if(s.isEmpty() || s.peek()!='['){
                        return false;
                    }
                    else{
                        s.pop();
                    }
                }
                else if(x.charAt(i)==')'){
                    if(s.isEmpty() || s.peek()!='('){
                        return false;
                    }
                    else{
                         s.pop();
                    }
                }
                else{
                    if(s.isEmpty() || s.peek()!='{'){
                        return false;
                    }
                    else{
                         s.pop();
                    }
                }
            }
        }
        if(s.isEmpty()) return true;
        return false;
    }
}