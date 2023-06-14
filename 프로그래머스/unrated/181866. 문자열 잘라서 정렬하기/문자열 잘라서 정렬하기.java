import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
            .filter(s -> s.length() > 0)
            .sorted(String::compareTo)
            .toArray(String[]::new);
    }
}