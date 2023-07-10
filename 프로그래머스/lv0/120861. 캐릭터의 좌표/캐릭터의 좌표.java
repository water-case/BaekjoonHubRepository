class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int[] res = {0, 0};
        
        for(String key : keyinput) {
            
            switch(key) {
                case "left" : res[0] -= res[0] > -board[0]/2 ? 1 : 0; break;
                case "right": res[0] += res[0] <  board[0]/2 ? 1 : 0; break;
                case "up"   : res[1] += res[1] <  board[1]/2 ? 1 : 0; break;
                case "down" : res[1] -= res[1] > -board[1]/2 ? 1 : 0; break;
            }
            
        }
        
        return res;
    }
}