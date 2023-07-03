import java.util.*;
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
      HashSet<Integer>hs=new HashSet<>();
	   for(int num:a){
	       hs.add(num);
	   }
	   int longest=1;
	   for(int num:a){
	       if(!hs.contains(num-1)){
	           int currentnum=num;
	           int count=1;
	           while(hs.contains(currentnum+1)){
	               currentnum=currentnum+1;
	               count=count+1;
	           }
	            longest=Math.max(count,longest);
	        }
	       
	   }
	   return longest;
    }
}
