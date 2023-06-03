import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> ans = new ArrayList<>();
        
        List<Integer> numList = new ArrayList<>();
        numList.add(0);
        for(int i=0; i<6; i++) {
            int val = (int)Math.pow(10, i) * 5;
            
            int size = numList.size();
            for(int j=0; j<size; j++) {
                numList.add(numList.get(j) + val);
            }
        }
        
        for(int num : numList) {
            if(num<l) {
                continue;
            }
            
            if(num>r) {
                break;
            }
            
            ans.add(num);
        }
        
        return ans.size() == 0 ? new int[] {-1} : ans.stream().mapToInt(i->i).toArray();
    }
}