class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder res = new StringBuilder();
        
        for(int i=0; i<parts.length; i++) {
            res.append(my_strings[i].substring(parts[i][0], parts[i][1]+1));
        }
        
        return res.toString();
    }
}