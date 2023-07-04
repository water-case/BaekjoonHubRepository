import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split(""))
            .mapToInt(Integer::parseInt)
            .filter(i -> i!=0 && i%3 == 0)
            .count();
    }
}