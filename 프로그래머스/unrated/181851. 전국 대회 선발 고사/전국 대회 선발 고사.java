import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        int[] a = {101, 101}, b = {101, 101}, c = {101, 101};
        for(int i=0; i<rank.length; i++) {
            if(attendance[i]) {
                int[] tmp = {i, rank[i]};
                if(rank[i] < a[1]) {
                    c = b;
                    b = a;
                    a = tmp;
                } else if(rank[i] < b[1]) {
                    c = b;
                    b = tmp;
                } else if(rank[i] < c[1]) {
                    c = tmp;
                }
            }
        }
        
        return 10000 * a[0] + 100 * b[0] + c[0];
    }
}