import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] strArr) {
        return IntStream.range(0, strArr.length)
            .mapToObj(n -> {
                if(n%2==0) {
                    return strArr[n].toLowerCase();
                } else {
                    return strArr[n].toUpperCase();
                }
            })
            .toArray(String[]::new);
    }
}