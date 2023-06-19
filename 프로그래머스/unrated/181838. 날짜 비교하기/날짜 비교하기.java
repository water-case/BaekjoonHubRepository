class Solution {
    public int solution(int[] date1, int[] date2) {
        int res = 0;
        
        if(date1[0] < date2[0]) {
            res = 1;
        }
        else if(date1[0] == date2[0]) {
            if(date1[1] < date2[1]) {
                res = 1;
            }
            else if(date1[1] == date2[1]) {
                if(date1[2] < date2[2]) {
                    res = 1;
                }
            }
            
        }
        
        return res;
    }
}