class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int left = 0;
        int right = 0;
        int count = 0;
        
        while (right < s.length()) {
            char ch = s.charAt(right);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            
            while (hm.containsKey('a') && hm.containsKey('b') && hm.containsKey('c') 
                  && hm.get('a') > 0 && hm.get('b') > 0 && hm.get('c') > 0) {
                count += s.length() - right;
                char leftChar = s.charAt(left);
                hm.put(leftChar, hm.get(leftChar) - 1);
                left++;
            }
            
            right++;
        }
        
        return count;
    }
}
