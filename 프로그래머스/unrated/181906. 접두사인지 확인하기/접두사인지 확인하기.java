import java.io.*;
import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        Set<String> hashSet = new HashSet<>();
        
        for(int i=0; i<my_string.length(); i++) {
            hashSet.add(my_string.substring(0, i));
        }
        
        return hashSet.contains(is_prefix) ? 1 : 0;
    }
}