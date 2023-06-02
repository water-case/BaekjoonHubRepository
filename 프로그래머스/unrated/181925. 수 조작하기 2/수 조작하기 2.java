class Solution {
    public String solution(int[] numLog) {
        StringBuilder res = new StringBuilder();
        
        int n = numLog[0];
        for(int i=1; i<numLog.length; i++) {
            int cal = numLog[i] - numLog[i-1];
            
            String s = "";
            switch(cal) {
                case   1: s="w"; break;
                case  -1: s="s"; break;
                case  10: s="d"; break;
                case -10: s="a"; break;
            }
            
            res.append(s);
        }
        
        return res.toString();
    }
}