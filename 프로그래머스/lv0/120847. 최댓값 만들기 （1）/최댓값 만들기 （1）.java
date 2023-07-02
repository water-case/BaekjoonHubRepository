import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        return IntStream.range(0, numbers.length-1)
            .map(i -> IntStream.range(i+1, numbers.length)
                        .map(j -> numbers[i] * numbers[j])
                        .max()
                        .getAsInt())
            .max()
            .getAsInt();
    }
}