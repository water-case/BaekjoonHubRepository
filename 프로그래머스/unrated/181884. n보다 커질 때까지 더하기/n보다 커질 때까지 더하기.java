class Solution {
    public int solution(int[] numbers, int n) {
        int num = 0;
        
        for(int i : numbers) {
            num += i;
            if(num > n) {
                break;
            }
        }
        
        return num;
    }
}