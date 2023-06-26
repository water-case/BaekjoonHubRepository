import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] res = {0,0};
        
        Arrays.stream(num_list)
            .forEach(num -> {
                if(num%2==0) {
                    res[0]++;
                } else {
                    res[1]++;
                }
            });
        
        return res;
    }
}