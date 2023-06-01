class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int mul = 1, pow = 0;
        
        for(int i=0; i<num_list.length; i++) {
            mul *= num_list[i];
            pow += num_list[i];
        }
        
        pow *= pow;
        
        answer = mul < pow ? 1 : 0;
        
        return answer;
    }
}