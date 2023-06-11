import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int res = 0;
        
        while(true) {
            int cnt = 0;
            
            for(int i=0; i<num_list.length; i++) {
                int num = num_list[i];
                
                if(num == 1) {
                    cnt++;
                    continue;
                }
                
                num_list[i] = num%2 == 0 ? num/2 : (num-1)/2;
                res++;
            }
            
            if(cnt == num_list.length) {
                break;
            }
        }
        
        return res;
    }
}