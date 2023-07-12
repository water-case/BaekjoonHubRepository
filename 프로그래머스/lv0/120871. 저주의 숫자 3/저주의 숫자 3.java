import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(1, 200)
            .filter(i -> i%3 != 0)
            .mapToObj(String::valueOf)
            .filter(s -> !s.contains("3"))
            .mapToInt(Integer::parseInt)
            .toArray()[n-1];
    }
}