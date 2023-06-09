import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> nlist = new ArrayList<>();
        
        for(int i=0; i<num_list.length; i+=n) {
            nlist.add(num_list[i]);
        }
        
        return nlist.stream().mapToInt(i->i).toArray();
    }
}