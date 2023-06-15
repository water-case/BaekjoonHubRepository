import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        
        for(int i : arr) {
            set.add(i);
        }
        
        int[] res = new int[k];
        Object[] sArr = set.toArray();
        
        for(int i=0; i<Math.min(res.length, sArr.length); i++) {
            res[i] = (int) sArr[i];
        }
        
        for(int i=Math.min(res.length, sArr.length); i<k; i++) {
            res[i] = -1;
        }
        
        return res;
    }
}