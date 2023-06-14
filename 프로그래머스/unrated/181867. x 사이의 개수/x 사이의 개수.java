import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String myString) {
        
        String[] sArr = myString.split("");
        List<Integer> res = new ArrayList<>();
        
        int cnt = 0;
        for(int i=0; i<sArr.length; i++) {
            if(sArr[i].equals("x")) {
                res.add(cnt);
                cnt = 0;
            } else {
                cnt++;
            }
        }
        res.add(cnt);
        
        return res.stream().mapToInt(i->i).toArray();
    }
}