import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String myString) {
        return Arrays.stream(myString.split(""))
            .map(str -> str.compareTo("l")>0 ? str : "l")
            .collect(Collectors.joining());
    }
}