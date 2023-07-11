import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for(String word : dic) {
            Set<String> set = new HashSet<>();
            
            set.addAll(
                Arrays.stream(word.split(""))
                      .collect(Collectors.toList())
            );
            
            if(set.size() != spell.length) {
                continue;
            }
            
            if(set.containsAll(Arrays.stream(spell)
                                     .collect(Collectors.toList()))) {
                return 1;
            }
        }
        
        return 2;
    }
}