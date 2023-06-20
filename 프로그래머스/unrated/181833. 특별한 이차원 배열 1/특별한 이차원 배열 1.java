class Solution {
    public int[][] solution(int n) {
        
        int[][] res = new int[n][n];
        
        for(int i=0; i<n; i++) {
            res[i][i] = 1;
        }
        
        return res;
    }
}