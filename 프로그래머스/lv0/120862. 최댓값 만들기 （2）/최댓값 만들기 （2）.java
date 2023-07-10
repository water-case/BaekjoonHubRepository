class Solution {
    public int solution(int[] numbers) {
        int res = Integer.MIN_VALUE;
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                res = Math.max(res, numbers[i] * numbers[j]);
            }
        }
        
        return res;
    }
}