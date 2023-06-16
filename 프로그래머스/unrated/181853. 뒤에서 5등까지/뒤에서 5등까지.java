import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list) {
        return IntStream.range(0, num_list.length)
            .map(i -> num_list[i])
            .sorted()
            .limit(5)
            .toArray();
    }
}