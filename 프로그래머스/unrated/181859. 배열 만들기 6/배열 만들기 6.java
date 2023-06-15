import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
            
        int i = 0;
        while(i < arr.length) {
            if(stk.isEmpty()) {
                stk.add(arr[i++]);
                continue;
            }
            
            if(stk.get(stk.size()-1) == arr[i]) {
                stk.remove(stk.size()-1);
                i++;
                continue;
            }
            
            if(stk.get(stk.size()-1) != arr[i]) {
                stk.add(arr[i++]);
            }
        }
        
        if(stk.size() == 0) {
            stk.add(-1);
        }
        
        return stk.stream().mapToInt(n->n).toArray();
    }
}