import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        
        Map<String, Integer> hashMap = new HashMap<>();
        
        for(String str : s.split("")) {
            if(hashMap.containsKey(str)) {
                int val = hashMap.get(str);
                hashMap.put(str, val+1);
            } else {
                hashMap.put(str, 1);
            }
        }
        
        List<String> strList = new ArrayList<>();
        
        hashMap.forEach((str, i) -> {
            if(i == 1) {
                strList.add(str);
            }
        });
        
        return strList.stream()
            .sorted()
            .collect(Collectors.joining());
    }
}