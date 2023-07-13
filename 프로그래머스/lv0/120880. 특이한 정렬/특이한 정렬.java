import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
            .boxed()
            .sorted(Collections.reverseOrder())
            .sorted(Comparator.comparing(num -> Math.abs(num - n)))
            .mapToInt(i -> i)
            .toArray();
    }
}