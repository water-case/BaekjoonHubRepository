import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap();
        
        for(String[] cloth : clothes) {
            
            int cnt = 0;
            
            if(map.containsKey(cloth[1])) {
                cnt = map.get(cloth[1]);
            }
            
            map.put(cloth[1], cnt + 1);
        }
        
        return map.entrySet().stream()
            .mapToInt(entry -> entry.getValue() + 1)
            .reduce(1, (l, r) -> l * r) - 1;
    }
}