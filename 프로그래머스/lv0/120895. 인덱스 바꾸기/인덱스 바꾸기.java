import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        String[] sArr = my_string.split("");
        
        String tmp = sArr[num1];
        sArr[num1] = sArr[num2];
        sArr[num2] = tmp;
        
        return Arrays.stream(sArr).collect(Collectors.joining());
    }
}