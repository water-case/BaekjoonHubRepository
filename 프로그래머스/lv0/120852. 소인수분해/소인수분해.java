import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> res = new HashSet<>();
        
        int idx = 2;
        while(n>=2) {
            
            if(n%idx == 0) {
                res.add(idx);
                n/=idx;
                continue;
            }
            
            idx++;
        }
        
        return res.stream().mapToInt(i->i).sorted().toArray();
    }
}