import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> nList = new ArrayList<>();
        
        if(direction.equals("left")) {
            nList = Arrays.stream(Arrays.copyOfRange(numbers, 1, numbers.length))
                .boxed()
                .collect(Collectors.toList());
            
            nList.add(numbers[0]);
        } else {
            nList.add(numbers[numbers.length - 1]);
            
            nList.addAll(Arrays.stream(Arrays.copyOfRange(numbers, 0, numbers.length - 1))
                         .boxed()
                         .collect(Collectors.toList()));
        }
        
        return nList.stream().mapToInt(i->i).toArray();
    }
}