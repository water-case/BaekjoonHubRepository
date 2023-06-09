import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] front = Arrays.copyOfRange(num_list, 0, n);
        int[] back  = Arrays.copyOfRange(num_list, n, num_list.length);
        return Stream.concat(Arrays.stream(back).boxed(), Arrays.stream(front).boxed()).mapToInt(i->i).toArray();
    }
}