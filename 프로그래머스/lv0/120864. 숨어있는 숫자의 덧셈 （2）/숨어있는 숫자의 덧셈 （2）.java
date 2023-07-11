class Solution {
    public int solution(String my_string) {
        int res = 0;
        
        int tmp = 0;
        for(String str : my_string.split("")) {
            if(isNumber(str)) {
                tmp = tmp*10 + Integer.parseInt(str);
            } else {
                res += tmp;
                tmp = 0;
            }
        }
        res += tmp;
        
        return res;
    }
    
    private boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}