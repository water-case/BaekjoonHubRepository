import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] res = {};
        
        for(int i=0; i<str_list.length; i++) {
            if(str_list[i].equals("l")) {
                res = Arrays.copyOfRange(str_list, 0, i);
                break;
            }
            
            if(str_list[i].equals("r")) {
                res = Arrays.copyOfRange(str_list, i+1, str_list.length);
                break;
            }
        }
        
        return res;
    }
}