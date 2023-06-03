import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> numList = new ArrayList<>();
        
        int num = n;
        while(num != 1) {
            numList.add(num);
            
            if(num%2 == 0) {
                num /= 2;
            }
            else {
                num = 3 * num + 1;
            }
        }
        numList.add(1);
            
        return numList.stream().mapToInt(i->i).toArray();
    }
}