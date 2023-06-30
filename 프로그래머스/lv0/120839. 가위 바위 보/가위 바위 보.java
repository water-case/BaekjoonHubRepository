import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String rsp) {
        return Arrays.stream(rsp.split(""))
            .map(str -> {
                if(str.equals("0")) {
                    return "5";
                }
                if(str.equals("2")) {
                    return "0";
                }
                return "2";
            })
            .collect(Collectors.joining());
    }
}