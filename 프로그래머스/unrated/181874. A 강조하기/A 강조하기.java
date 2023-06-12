import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String myString) {
        String[] sarr = myString.split("");
        
        return IntStream.range(0, myString.length())
            .mapToObj(i -> {
                if(sarr[i].equals("A")) {
                    return sarr[i];
                }
                return sarr[i].equals("a") ? sarr[i].toUpperCase() : sarr[i].toLowerCase();
            })
            .reduce("", (a, b) -> a + b);
    }
}