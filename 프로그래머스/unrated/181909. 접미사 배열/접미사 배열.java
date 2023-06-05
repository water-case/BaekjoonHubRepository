import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> sList = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++) {
            sList.add(my_string.substring(i));
        }
        
        Collections.sort(sList);
        
        return sList.stream().toArray(String[]::new);
    }
}