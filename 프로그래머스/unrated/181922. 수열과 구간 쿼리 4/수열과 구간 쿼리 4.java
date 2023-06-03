import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        
        for(int[] q : queries) {
            
            for(int i=q[0]; i<=q[1]; i++) {
                
                if(i%q[2] == 0) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}