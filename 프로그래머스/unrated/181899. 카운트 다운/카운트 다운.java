class Solution {
    public int[] solution(int start, int end) {
        int[] res = new int[start - end + 1];
        
        for(int i = 0; i<=start-end; i++) {
            res[i] = start - i;
        }
        
        return res;
    }
}