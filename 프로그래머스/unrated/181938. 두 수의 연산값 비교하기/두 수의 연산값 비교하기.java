class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int fir = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int sec = 2 * a * b;
        answer = fir >= sec ? fir : sec;
        
        return answer;
    }
}