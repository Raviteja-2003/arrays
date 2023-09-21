import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

class Solution {
    public static ArrayList<String> subsequences(String str) {
        ArrayList<String> ar=new ArrayList<>();
        int n=str.length();
        for(int i=0;i<(1<<n);i++){
            StringBuilder s=new StringBuilder();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0) s.append(str.charAt(j));
            }
            if(s.length()!=0){
                ar.add(s.toString());
            }
        }
        return ar;
    }
}