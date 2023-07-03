import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        int n=a.length;
        ArrayList<Integer> ar=new ArrayList<>();
        int maxi=a[n-1];
        ar.add(maxi);
        for(int i=n-2;i>=0;i--){
            if(a[i]>maxi){
                ar.add(a[i]);
                maxi=a[i];
            }
        }
        return ar;
    }
}
