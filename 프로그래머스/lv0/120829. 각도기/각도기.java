class Solution {
    public int solution(int angle) {
        if(angle%90==0) {
            return angle/90 * 2;
        }
        
        if(angle<90) {
            return 1;
        }
        
        return 3;
    }
}