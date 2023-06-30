class Solution {
    public int solution(int hp) {
        int res = hp/5;
        hp %= 5;
        res += hp/3;
        hp %= 3;
        res += hp;
        return res;
    }
}