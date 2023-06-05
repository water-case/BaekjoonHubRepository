class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder res = new StringBuilder();
        
        for(int i=0; i<code.length(); i++) {
            if(i%q == r) {
                res.append(code.charAt(i));
            }
        }
        
        return res.toString();
    }
}