class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int cnt = cntEquals(a, b, c);
        
        answer += a + b + c;
        if(cnt >= 1) {
            answer *= a*a + b*b + c*c;
        }
        if(cnt == 3) {
            answer *= a*a*a + b*b*b + c*c*c;
        }
        
        return answer;
    }
    
    private int cntEquals(int a, int b, int c) {
        int cnt = 0;
        
        if(a == b) {
            cnt++;
        }
        if(b == c) {
            cnt++;
        }
        if(a == c) {
            cnt++;
        }
        
        return cnt;
    }
}