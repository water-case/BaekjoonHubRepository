import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        int start = 0, end = 0;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) {
                start = i;
                break;
            }
        }
        
        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i] == 2) {
                end = i;
                break;
            }
        }
        
        int[] res = IntStream.rangeClosed(start, end).map(i->arr[i]).toArray();
        return start == 0 && end == 0 ? new int[] {-1} : res;
    }
}