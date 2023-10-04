//optimal solution
class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        int res=0;
        int n=str.length();
        HashMap<Character,Integer> roman=new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        for(int i=0;i<n;i++){
            int val=roman.get(str.charAt(i));
            if(i<n-1 && val<roman.get(str.charAt(i+1))){
                res=res-val;
            }
            else{
                res=res+val;
            }
        }
        return res;
    }
}
//brute approach
class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        int res=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='I'){
                if(i==n-1 || i==n-2 && str.charAt(i+1)=='I'){
                    res=res+1;
                }
                else if(str.charAt(i+1)=='V'||str.charAt(i+1)=='X'){
                    res=res-1;
                }
                else if(str.charAt(i+1)=='I' && str.charAt(i+2)=='V'){
                    res=res-2;
                    i++;
                }
                else{
                    res=res+1;
                }
            }
            else if(str.charAt(i)=='V'){
                res=res+5;
            }
            else if(str.charAt(i)=='X'){
                 if(i==n-1 || i==n-2 && str.charAt(i+1)=='X'){
                    res=res+10;
                }
                else if(str.charAt(i+1)=='L'||str.charAt(i+1)=='C'){
                    res=res-10;
                }
                else{
                    res=res+10;
                }
            }
            else if(str.charAt(i)=='L'){
                res=res+50;
            }
            else if(str.charAt(i)=='C'){
                 if(i==n-1 || i==n-2 && str.charAt(i+1)=='C'){
                    res=res+100;
                }
                else if(str.charAt(i+1)=='D'||str.charAt(i+1)=='M'){
                    res=res-100;
                }
                else{
                    res=res+100;
                }
            }
            else if(str.charAt(i)=='D'){
                res=res+500;
            }
            else if(str.charAt(i)=='M'){
                res=res+1000;
            }
        }
        return res;
    }
}