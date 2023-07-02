import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n)
            .filter(num -> {
                for(int i=2; i<num; i++) {
                    if(num % i == 0) {
                        return true;
                    }
                }
                return false;
            })
            .count();
    }
}