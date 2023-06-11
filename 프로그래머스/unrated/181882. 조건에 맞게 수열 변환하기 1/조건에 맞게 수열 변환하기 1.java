import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr)
            .map(i->{
                if(i>=50 && i%2==0) {
                    return i/2;
                } else if(i<50 && i%2==1) {
                    return i*2;
                }
                return i;
            })
            .toArray();
    }
}