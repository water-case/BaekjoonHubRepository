import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int start, int end) {
        
        List<Integer> numList = new ArrayList<>();
        for(int i=start; i<=end; i++) {
            numList.add(i);
        }
        
        return numList.stream().mapToInt(i->i).toArray();
    }
}