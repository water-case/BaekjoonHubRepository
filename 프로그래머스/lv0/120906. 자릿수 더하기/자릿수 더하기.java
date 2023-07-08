import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n) {
        return Arrays.stream(String.valueOf(n).split(""))
            .mapToInt(Integer::parseInt)
            .sum();
    }
}