import java.util.*;
import java.util.stream.*;

class Solution {
    public double solution(int[] numbers) {
        return (double)Arrays.stream(numbers).sum() / numbers.length;
    }
}