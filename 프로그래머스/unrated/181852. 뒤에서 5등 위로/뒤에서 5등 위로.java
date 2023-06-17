import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] sortedArr = Arrays.stream(num_list).sorted().toArray();
        return Arrays.copyOfRange(sortedArr, 5, sortedArr.length);
    }
}