class Solution {
    public int solution(int[][] lines) {
        int res = 0;
        
        int[] map = new int[201];
        for(int[] line : lines) {
            for(int i=line[0]+100; i<line[1]+100; i++) {
                map[i]++;
            }
        }
        
        for(int i=0; i<=200; i++) {
            if(map[i] > 1) {
                res++;
            }
        }
        
        return res;
    }
}