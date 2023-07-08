import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int num, int k) {
        
        int res = -1;
        
        int[] nArr = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        
        for(int i=0; i<nArr.length; i++) {
            if(nArr[i]==k) {
                res = i+1;
                break;
            }
        }
        
        return res;
    }
}