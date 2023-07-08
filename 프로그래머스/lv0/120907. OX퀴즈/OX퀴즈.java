import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> res = new ArrayList<>();
        
        for(String q : quiz) {
            
            String[] sArr = q.split(" ");
            
            int cal = 0, a = Integer.parseInt(sArr[0]), b = Integer.parseInt(sArr[2]);
            if(sArr[1].equals("+")) {
                cal = a + b;
            } else {
                cal = a - b;
            }
            res.add(cal == Integer.parseInt(sArr[4]) ? "O" : "X");
        }
        
        return res.stream().toArray(String[]::new);
    }
}