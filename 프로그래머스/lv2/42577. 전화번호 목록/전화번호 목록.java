import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        Set<String> set = new HashSet();
        
        for(String phone : phone_book) {
            for(int i=0; i<phone.length(); i++) {
                set.add(phone.substring(0, i));
            }
        }
        
        boolean res = true;
        for(String phone : phone_book) {
            if(set.contains(phone)) {
                res = false;
                break;
            }
        }
        
        return res;
    }
}