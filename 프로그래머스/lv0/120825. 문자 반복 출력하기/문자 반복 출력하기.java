import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int n) {
        return Arrays.stream(my_string.split(""))
            .map(str -> {
                String res = "";
                for(int i=0; i<n; i++) {
                    res += str;
                }
                return res;
            })
            .collect(Collectors.joining());
    }
}