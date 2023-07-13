import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[][] score) {
        
        List<Double> sList = new ArrayList<>();
        for(int[] sa : score) {
            sList.add((sa[0] + sa[1]) / 2.0);
        }
        
        List<Double> sortedList = sList.stream()
            .sorted(Collections.reverseOrder())
            .collect(Collectors.toList());
        
        return sList.stream()
            .map(s -> sortedList.indexOf(s)+1)
            .mapToInt(i -> i)
            .toArray();
    }
}