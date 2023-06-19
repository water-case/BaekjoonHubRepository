class Solution {
    public int solution(int a, int b) {
        int res = 0;
        
        if(a%2 != 0 && b%2 != 0) {
            res = a*a + b*b;
        }
        else if(a%2 != 0 || b%2 != 0) {            
            res = 2 * (a+b);
        }
        else {
            res = Math.abs(a-b);
        }
        
        return res;
    }
}