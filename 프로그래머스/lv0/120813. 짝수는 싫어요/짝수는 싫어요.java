import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        return IntStream.range(0, n%2 == 0 ? n/2 : n/2 + 1)
            .map(i -> i * 2 + 1)
            .toArray();
    }
}