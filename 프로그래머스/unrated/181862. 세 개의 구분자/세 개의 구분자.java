import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> res = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(myStr, "abc");
        while(st.hasMoreTokens()) {
            res.add(st.nextToken());
        }
        
        if(res.size() == 0) {
            res.add("EMPTY");
        }
        
        return res.stream().toArray(String[]::new);
    }
}