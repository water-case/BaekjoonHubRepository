class Solution {
    public int solution(int n) {
        
        int cal = 1, idx = 1;
        
        for(;idx<=10; idx++) {
            cal *= idx;
            if(cal > n) {
                break;
            }
        }
        
        return idx-1;
    }
}