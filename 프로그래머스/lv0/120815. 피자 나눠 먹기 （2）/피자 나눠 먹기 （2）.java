class Solution {
    public int solution(int n) {
        return (n * 6 / gcd(n, 6)) / 6;
    }
    
    private int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }
        
        return gcd(y, x%y);
    }
}