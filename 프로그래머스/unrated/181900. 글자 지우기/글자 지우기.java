class Solution {
    public String solution(String my_string, int[] indices) {
        String[] s = my_string.split("");
        
        for(int i=0; i<indices.length; i++) {
            s[indices[i]] = "";
        }
        
        String res = "";
        for(int i=0; i<s.length; i++) {
            res += s[i];
        }
        
        return res;
    }
}