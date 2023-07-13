import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String[] babbling) {
        
        Set<String> set = new HashSet<>();
        comb(0, "", new boolean[4], set);
        
        return (int) Arrays.stream(babbling)
            .filter(str -> set.contains(str))
            .count();
    }
    
    String[] sa = new String[] {"aya", "ye", "woo", "ma"};
    
    private void comb(int cnt, String s, boolean[] v, Set<String> set) {
        
        if(cnt == 4) {
            set.add(s);
            return;
        }
        
        for(int i=0; i<4; i++) {
            if(v[i]) {
                continue;
            }
            
            v[i] = true;
            String ns = s + sa[i];
            comb(cnt + 1, ns, v, set);
            comb(cnt + 1, s, v, set);
            v[i] = false;
        }
        
    }
}