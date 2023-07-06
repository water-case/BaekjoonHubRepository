import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        return (int) Arrays.stream(s1)
            .filter(str1 -> Arrays.stream(s2)
                    .filter(str2 -> str1.equals(str2))
                    .count() > 0)
            .count();
    }
}