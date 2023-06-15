import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int size = 1;
        while(size < arr.length) {
            size *= 2;
        }
        
        return Arrays.copyOfRange(arr, 0, size);
    }
}