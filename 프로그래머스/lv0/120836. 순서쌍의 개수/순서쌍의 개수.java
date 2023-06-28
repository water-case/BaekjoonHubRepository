import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n)
            .filter(i -> n%i == 0)
            .count();
    }
}