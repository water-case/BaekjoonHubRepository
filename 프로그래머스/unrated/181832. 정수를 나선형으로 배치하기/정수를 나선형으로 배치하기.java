import java.util.*;

class Solution {
    public int[][] solution(int n) {
        
        int[][] map = new int[n][n];
        
        int[] delx = { 0, 1, 0,-1}; // 우하좌상
        int[] dely = { 1, 0,-1, 0}; // 우하좌상
        
        int x=0, y=0, d=0, idx=1;
        
        while(idx <= n*n) {
            map[x][y] = idx++;
            
            int dx = x+delx[d], dy = y+dely[d];
            if(dx<0 || dx>=n || dy<0 || dy>=n || map[dx][dy]!=0) {
                d = (d+1)%4;
                dx = x+delx[d];
                dy = y+dely[d];
            }
            
            x = dx;
            y = dy;
        }
        
        return map;
    }
}