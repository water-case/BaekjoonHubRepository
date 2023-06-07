import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> nList = new ArrayList<>();
        
        int num = k;
        while(num <= n) {
            nList.add(num);
            num += k;
        }
        
        return nList.stream().mapToInt(i->i).toArray();
    }
}