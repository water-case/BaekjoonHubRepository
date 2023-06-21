class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        
        int n = Math.max(row, col);
        int[][] res = new int[n][n];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                res[i][j] = i>=row || j>= col ? 0 : arr[i][j];
            }
        }
        
        return res;
    }
}