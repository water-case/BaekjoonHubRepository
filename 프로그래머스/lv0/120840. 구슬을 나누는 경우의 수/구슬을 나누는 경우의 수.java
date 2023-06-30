class Solution {
    public int solution(int balls, int share) {
        perm(0, 0, balls, share);
        return res;
    }
    
    int res = 0;
    
    private void perm(int cnt, int idx, int size, int max) {
        if(cnt == max) {
            res++;
            return;
        }
        
        for(int i=idx; i<size; i++) {
            perm(cnt+1, i+1, size, max);
        }
    }
}