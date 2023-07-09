import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<my_str.length(); i+=n) {
            list.add(my_str.substring(i, my_str.length() < i+n ? my_str.length() : i+n));
        }
        
        return list.stream().toArray(String[]::new);
    }
}