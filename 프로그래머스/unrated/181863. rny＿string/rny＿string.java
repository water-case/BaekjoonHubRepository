import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String rny_string) {
        return Arrays.stream(rny_string.split(""))
            .map(s -> s.equals("m") ? "rn" : s)
            .reduce("", (a, b) -> a + b);
    }
}