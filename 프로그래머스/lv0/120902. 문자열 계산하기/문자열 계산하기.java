import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string, " ");
        
        int res = Integer.parseInt(st.nextToken());
        while(st.hasMoreTokens()) {
            
            String now = st.nextToken();
            
            if(now.equals("+")) {
                res += Integer.parseInt(st.nextToken());
            } else if(now.equals("-")) {
                res -= Integer.parseInt(st.nextToken());
            }
        }
        
        return res;
    }
}