import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap();
        for(int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        
        for(String calling : callings) {
            int rank = map.get(calling);
            
            String front = players[rank-1];
            String back = players[rank];
            
            players[rank-1] = back;
            players[rank] = front;
            
            map.put(front, rank);
            map.put(back, rank-1);
        }
        
        return players;
    }
}