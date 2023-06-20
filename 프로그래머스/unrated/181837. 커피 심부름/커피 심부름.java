import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String[] order) {
        return Arrays.stream(order)
            .mapToInt(s -> s.contains("cafelatte") ? 5000 : 4500)
            .sum();
    }
}