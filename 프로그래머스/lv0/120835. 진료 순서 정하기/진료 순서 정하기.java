import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> rank = Arrays.stream(emergency)
            .boxed()
            .sorted(Collections.reverseOrder())
            .collect(Collectors.toList());
        
        return Arrays.stream(emergency)
            .map(i -> rank.indexOf(i) + 1)
            .toArray();
    }
}