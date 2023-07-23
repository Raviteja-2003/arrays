class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<words.size();i++){
            String str=words.get(i);
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);
                if(ch==separator){
                    if(sb.length()>0){
                         res.add(sb.toString());
                    }
                    sb=new StringBuilder();
                }
                else{
                    sb.append(ch);
                }
            }
            if(sb.length()>0){
                res.add(sb.toString());
            }
        }
        return res;
    }
}