import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        
        List<String> res = new ArrayList<>();
        
        for(String pic : picture) {
            String tmp = "";
            for(int i=0; i<pic.length(); i++) {
                for(int j=0; j<k; j++) {
                    tmp += pic.charAt(i);
                }
            }
            
            for(int i=0; i<k; i++) {
                res.add(tmp);
            }
        }
        
        return res.stream().toArray(String[]::new);
    }
}