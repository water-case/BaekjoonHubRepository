class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int cnt = 0;
        
        for(int i=0; i<included.length; i++) {
            
            if(included[i]) {
                cnt++;
                answer += d * i;
            }
        }
        
        answer += cnt * a;
        
        return answer;
    }
}