class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int fir = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int sec = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        answer = fir >= sec ? fir : sec;
        
        return answer;
    }
}