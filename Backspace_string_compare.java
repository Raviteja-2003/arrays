lass Solution {
    public boolean backspaceCompare(String s, String t) {
        int skipS=0;
        int skipT=0;
        int r1=s.length()-1;
        int r2=t.length()-1;
        while(r1>=0 || r2>=0){
            while(r1>=0){
                if(s.charAt(r1)=='#'){
                    skipS++;
                    r1--;
                }
                else if(skipS>0){
                    skipS--;
                    r1--;
                }
                else{
                    break;
                }
            }
            while(r2>=0){
                if(t.charAt(r2)=='#'){
                    skipT++;
                    r2--;
                }
                else if(skipT>0){
                    skipT--;
                    r2--;
                }
                else{
                    break;
                }
            }
            if(r1>=0 && r2>=0 && s.charAt(r1)!=t.charAt(r2)){
                return false;
            }
            if((r1>=0)!=(r2>=0)) return false;
            r1--;
            r2--;
        }
        return true;
    }
}