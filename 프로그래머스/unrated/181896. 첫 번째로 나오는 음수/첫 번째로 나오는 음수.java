import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        int cnt = (int) Arrays.stream(num_list).takeWhile(n->n>=0).count();
        return cnt != num_list.length ? cnt : -1;
    }
}