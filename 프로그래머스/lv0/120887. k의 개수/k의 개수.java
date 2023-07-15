import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int i, int j, int k) {
        return (int) IntStream.rangeClosed(i, j)
            .mapToObj(num -> String.valueOf(num))
            .flatMap(str -> Arrays.stream(str.split("")))
            .mapToInt(Integer::parseInt)
            .filter(num -> num==k)
            .count();
    }
}