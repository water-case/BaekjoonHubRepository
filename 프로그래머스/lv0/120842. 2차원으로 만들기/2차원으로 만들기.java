import java.util.*;
import java.util.stream.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] res = new int[num_list.length/n][];
        
        for(int i=0; i<num_list.length/n; i++) {
            res[i] = Arrays.copyOfRange(num_list, i*n, i*n+n);
        }
            
        return res;
    }
}