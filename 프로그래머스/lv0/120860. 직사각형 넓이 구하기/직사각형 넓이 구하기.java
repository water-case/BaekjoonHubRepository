class Solution {
    public int solution(int[][] dots) {
        int x = 0, y = 0;
        
        for(int i=0; i<3; i++) {
            x = Math.max(Math.abs(dots[i][0] - dots[i+1][0]), x);
            y = Math.max(Math.abs(dots[i][1] - dots[i+1][1]), y);
        }
        
        return x * y;
    }
}