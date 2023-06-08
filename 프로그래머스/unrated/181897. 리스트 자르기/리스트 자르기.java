import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a=0, b=slicer[1];
        switch(n) {
            case 2:
                a = slicer[0];
                b = num_list.length-1;
                break;
            case 3:
                a = slicer[0];
                break;
            case 4:
                a = slicer[0];
                break;
        }
        
        return IntStream.rangeClosed(a, b)
            .filter(i->{
                if(n==4) {
                    return i%slicer[2] == slicer[0]%slicer[2];
                }
                return true;
            })
            .map(i->num_list[i])
            .toArray();
    }
}