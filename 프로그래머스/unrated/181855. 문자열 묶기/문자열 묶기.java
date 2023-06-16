import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String[] strArr) {
        int[] cnt = new int[31];
        
        Arrays.stream(strArr).forEach(s -> cnt[s.length()]++);
        
        return IntStream.rangeClosed(1, 30).map(i -> cnt[i]).max().getAsInt();
    }
}