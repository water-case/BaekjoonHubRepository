class Solution {
    public int solution(int[] sides) {
        int res = 0;
        
        int longSide = Math.max(sides[0], sides[1]);
        int shortSide = Math.min(sides[0], sides[1]);
        
        // longSide가 가장 긴 변인 경우
        res += shortSide;
        
        // 정해지지 않은 변이 가장 긴 변인 경우
        res += shortSide - 1;
        
        return res;
    }
}