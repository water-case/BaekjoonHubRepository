import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        
        for(int i : array) {
            list.addAll(Arrays.stream(String.valueOf(i).split(""))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList()));
        }
        
        return (int) list.stream()
            .filter(i -> i!=0)
            .filter(i -> i%7==0)
            .count();
    }
}