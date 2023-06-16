import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        
        int idx = arr.length%2 == 0 ? 1 : 0;
        
        return IntStream.range(0, arr.length)
            .map(i -> i%2 == idx ? arr[i] + n : arr[i])
            .toArray();
    }
}