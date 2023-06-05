import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> nList = new ArrayList<>();
        
        for(String str : intStrs) {
            
            int n = Integer.parseInt(str.substring(s, s+l));
            
            if(n > k) {
                nList.add(n);
            }
        }
        
        return nList.stream().mapToInt(n->n).toArray();
    }
}