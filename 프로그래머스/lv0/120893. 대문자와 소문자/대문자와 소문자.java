import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        
        String res = "";
        
        for(char ch : my_string.toCharArray()) {
            res += Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch);
        }
        
        return res;
    }
}