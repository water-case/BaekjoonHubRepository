class Solution {
    public int solution(int[][] board) {
        
        int[] delx = {-1,-1, 0, 1, 1, 1, 0,-1}; // 상부터 시계방향
        int[] dely = { 0, 1, 1, 1, 0,-1,-1,-1}; // 상부터 시계방향
        
        int n = board.length;
        boolean[][] map = new boolean[n][n];
        
        for(int i=0; i<n; i++) {
            
            for(int j=0; j<n; j++) {
                
                if(board[i][j] == 1) {
                    map[i][j] = true;
                    
                    for(int d=0; d<8; d++) {
                        
                        int dx = i + delx[d], dy = j + dely[d];
                        if(dx<0 || dx>=n || dy<0 || dy>=n) {
                            continue;
                        }
                        map[dx][dy] = true;
                        
                    }
                }
            }
        }
        
        int res = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(!map[i][j]) {
                    res++;
                }
            }
        }
        
        return res;
    }
}