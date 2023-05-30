class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        boolean chk = false;
        if(ineq.equals("<")) {
            if(eq.equals("=")) {
                chk = n<=m;
            } else {
                chk = n<m;
            }
        } else {
            if(eq.equals("=")) {
                chk = n>=m;
            } else {
                chk = n>m;
            }
        }
        
        answer = chk ? 1 : 0;
        return answer;
    }
}