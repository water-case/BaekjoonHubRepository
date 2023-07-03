import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String s) {
        List<Integer> nList = new ArrayList<>();
        
        String[] sArr = s.split(" ");
        for(int i=0; i<sArr.length; i++) {
            if(sArr[i].equals("Z")) {
                nList.remove(nList.size()-1);
                continue;
            }
            
            nList.add(Integer.parseInt(sArr[i]));
        }
        
        return nList.stream().reduce(Integer::sum).orElseGet(() -> 0);
    }
}