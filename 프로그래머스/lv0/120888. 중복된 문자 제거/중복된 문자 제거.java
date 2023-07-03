import java.util.*;

class Solution {
    public String solution(String my_string) {
        Set<String> str = new LinkedHashSet<>();
        
        String[] sArr = my_string.split("");
        for(int i=0; i<sArr.length; i++) {
            str.add(sArr[i]);
        }
        
        return str.stream().reduce("", (s1, s2) -> s1 + s2);
    }
}