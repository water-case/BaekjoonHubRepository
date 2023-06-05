import java.io.*;
import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        List<String> sList = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++) {
            sList.add(my_string.substring(i));
        }
        
        return sList.contains(is_suffix) ? 1 : 0;
    }
}