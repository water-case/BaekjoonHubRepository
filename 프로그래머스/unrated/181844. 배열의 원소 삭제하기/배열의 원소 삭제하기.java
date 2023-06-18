import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        for(int i : delete_list) {
            if(arrList.contains(i)) {
                arrList.remove(arrList.indexOf(i));
            }
        }
        
        return arrList.stream().mapToInt(i->i).toArray();
    }
}