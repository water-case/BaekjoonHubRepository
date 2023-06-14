import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String myString, String pat) {
        return Arrays.stream(myString.split(""))
            .map(s -> {
                if(s.equals("A")) {
                    return "B";
                } else {
                    return "A";
                }
            })
            .reduce("", (a, b) -> a + b)
            .contains(pat) ? 1 : 0;
    }
}