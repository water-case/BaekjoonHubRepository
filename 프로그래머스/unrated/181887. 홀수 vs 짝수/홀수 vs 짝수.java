class Solution {
    public int solution(int[] num_list) {
        
        int odd_sum = 0, even_sum = 0;
        for(int i=0; i<num_list.length; i++) {
            int num = num_list[i];
            if(i%2 == 0) {
                even_sum += num;
            } else {
                odd_sum += num;
            }
        }
        
        return even_sum >= odd_sum ? even_sum : odd_sum;
    }
}