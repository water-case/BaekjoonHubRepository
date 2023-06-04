class Solution {
    
    String[] sArr;
    
    public String solution(String my_string, int[][] queries) {

        sArr = my_string.split("");
        
        for(int[] query : queries) {
            reverseStr(query[0], query[1]);
        }
        
        StringBuilder res = new StringBuilder();
        for(String s : sArr) {
            res.append(s);
        }
        
        return res.toString();
    }
    
    private void reverseStr(int s, int e) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=s; i<=e; i++) {
            sb.append(sArr[i]);
        }
        
        sb.reverse();
        
        String[] sa = sb.toString().split("");
        for(int i=s; i<=e; i++) {
            sArr[i] = sa[i-s];
        }
    }
}