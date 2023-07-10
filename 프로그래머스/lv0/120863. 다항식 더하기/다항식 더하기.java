import java.util.*;

class Solution {
    public String solution(String polynomial) {
        
        int xn = 0, n = 0;

        StringTokenizer st = new StringTokenizer(polynomial, " + ");
        while(st.hasMoreTokens()) {
            
            String s = st.nextToken();
            
            if(s.contains("x")) {
                
                xn += s.length() == 1 ? 1 : Integer.parseInt(s.substring(0, s.length()-1));
                
            } else {
                
                n += Integer.parseInt(s);
                
            }
        }
        
        String res = "";
        if(xn != 0) {
            if(xn > 1) {
                res += xn;
            }
            res += "x";
        }
        if(n != 0) {
            if(res.length() != 0) {
                res += " + ";
            }
            res += n;
        }
        
        return res;
    }
}