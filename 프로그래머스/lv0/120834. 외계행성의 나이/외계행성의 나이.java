import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(int age) {
        return Arrays.stream(String.valueOf(age).split(""))
            .map(str -> String.valueOf((char) (Integer.parseInt(str) + 97)))
            .collect(Collectors.joining());
    }
}