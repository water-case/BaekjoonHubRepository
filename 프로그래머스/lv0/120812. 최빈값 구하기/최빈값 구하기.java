class Solution {
    public int solution(int[] array) {
        int[] cnt = new int[1001];
        
        for(int i : array) {
            cnt[i]++;
        }
        
        int res = 0;
        int max = 0;
        
        for(int i=0; i<cnt.length; i++) {
            if(cnt[i] == max) {
                res = -1;
                continue;
            }
            
            if(cnt[i] > max) {
                max = cnt[i];
                res = i;
                continue;
            }
        }
        
        return res;
    }
}