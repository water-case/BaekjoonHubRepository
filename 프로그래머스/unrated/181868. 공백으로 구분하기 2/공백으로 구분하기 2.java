import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string, " ");
        List<String> list = new ArrayList<>();
        while(st.hasMoreTokens()) {
            String s = st.nextToken();
            if(s.equals(" ")) {
                continue;
            }
            list.add(s.trim());
        }
        return list.stream().toArray(String[]::new);
    }
}