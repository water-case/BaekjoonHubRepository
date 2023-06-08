import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        IntStream stream1 = IntStream.rangeClosed(intervals[0][0], intervals[0][1]);
        IntStream stream2 = IntStream.rangeClosed(intervals[1][0], intervals[1][1]);
        return Stream.concat(stream1.map(i->arr[i]).boxed(), stream2.map(i->arr[i]).boxed()).mapToInt(i->i).toArray();
    }
}