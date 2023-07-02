import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String my_string) {
        return Arrays.stream(my_string.split(""))
            .filter(str -> "0123456789".contains(str))
            .map(str -> Integer.parseInt(str))
            .mapToInt(i -> i)
            .sorted()
            .toArray();
    }
}