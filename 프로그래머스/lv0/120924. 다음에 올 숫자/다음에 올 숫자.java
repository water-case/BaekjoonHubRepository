class Solution {
    public int solution(int[] common) {
        
        int cal1 = common[1] - common[0];
        int cal2 = common[2] - common[1];
        
        int res = common[common.length-1];
        
        if(cal1 == cal2) {
            res += cal1;
        } else {
            res *= cal2 / cal1;
        }
        
        return res;
        
    }
}