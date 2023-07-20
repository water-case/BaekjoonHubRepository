import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        
        ArrayDeque<Integer> q = new ArrayDeque<>();

        for(int num : arr) {
            if(q.isEmpty() || !q.getLast().equals(num)) {
                q.add(num);
            }
        }
        
        return q.stream()
            .mapToInt(i->i)
            .toArray();
    }
}