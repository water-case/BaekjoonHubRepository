import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, String letter) {
        return Arrays.stream(my_string.split(""))
            .filter(str -> !str.equals(letter))
            .collect(Collectors.joining());
    }
}