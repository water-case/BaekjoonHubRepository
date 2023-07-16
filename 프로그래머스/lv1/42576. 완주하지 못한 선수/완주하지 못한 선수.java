import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Map<String, Integer> map = new HashMap();
        
        for(String comp : completion) {
            
            int cnt = 0;
            
            if(map.containsKey(comp)) {
                cnt = map.get(comp);
            }
            
            map.put(comp, cnt + 1);
        }
        
        String res = "";
        for(String part : participant) {
            
            if(map.containsKey(part) && map.get(part) > 0) {
                int cnt = map.get(part);
                map.put(part, cnt - 1);
            } else {
                res = part;
                break;
            }
        }
        
        return res;
    }
}