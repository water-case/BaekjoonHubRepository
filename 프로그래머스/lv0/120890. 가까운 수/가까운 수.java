class Solution {
    public int solution(int[] array, int n) {
        
        int res = 0, diff = 101;
        
        for(int num : array) {
            
            int cal = Math.abs(num - n);
            if(diff > cal) {
                diff = cal;
                res = num;
            } else if(diff == cal) {
                res = Math.min(res, num);
            }
        }
        
        
        return res;
    }
}