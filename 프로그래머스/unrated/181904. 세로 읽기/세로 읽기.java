class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder res = new StringBuilder();
        
        for(int i=0; i<my_string.length()/m; i++) {
            res.append(my_string.charAt(i*m + c - 1));
        }
        
        return res.toString();
    }
}